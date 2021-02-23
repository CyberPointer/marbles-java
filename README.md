# Marbles-java


## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Algorithms](#algorithms)


## General info
2D Moving marbles simulation with collision detection. Marbles are moving with constant value, without drag, collisions calculated between them are elastic and in the most cases not central. 
	
## Technologies
Project is created with:
* Java 
* Swing
* Awt
* Java2d
* Netbeans

## Algorithms

![Algorithm schema](./images/circle_not_central.png)
Image presents problem with using java2d. Circle isnt drawn from circle's center. Drawning starts from top, left side of it. Thats why small calculation correction of axis_x and axis_y  is needed.
 
![Algorithm schema](./images/collision_wall.jpg)
In case of collision with wall angle of reflection stays the same thats why just changing moving vector dirrection to opposite is enough to calculate new velocity.

![Algorithm schema](./images/collision_not_central.jpg)
Example of not centrall collision when marbles are not facing each other.

![Algorithm schema](./images/collision_1.jpg)
Situation becomes more complex when 2d marbles are colliding facing each other. In order to solve that problem equation to calculate the momentum with additonal angle of reflection is being used.

![Algorithm schema](./images/calculation_momentum.jpg)

