import random as r 
from random import seed, randint  #seed method is used to generate random umber generator and randint generates random integer
import numpy as np 

def game(winningdoor, selected_door, change= False):
  assert winningdoor < 3
  assert winningdoor >= 0 #assert keyword checks the condition is true and if not error is raised

  #the host removes the first door that was not selected neither winning 
  removed_door = next(i for i in range(3) if i != selected_door and i != winningdoor)

  #if player decides to change the door 
  if change:
    selected_door = next(i for i in range(3) if i != selected_door and i != removed_door)

  #we suppose player does not want to change
  return selected_door == winningdoor 

#defining a constructor 
if __name__ == '__main__': 
  playerdoors = np.random.random_integers(0,2, (1000 * 1000 * 1))

  winningdoors = [d for d in playerdoors if game(1,d)]
  print('Winning percentage without changing the choice: ', len(winningdoors) / len(playerdoors))

  winningdoors = [d for d in playerdoors if game(1, d, change=True)]
  print('Winning percentage while changing choice: ', len(winningdoors) / len(playerdoors))
