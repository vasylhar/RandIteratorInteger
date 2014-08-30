RandIteratorInteger
===================

Algo to choose random iterator integer with uniform distribution 
based on continuous new feeds of integers by iterator from a list

Implemented simple LCG random number generator which proves in this
algorithm to converge to uniform distribution with sufficiently
large number of random variables generated.

LCG is fast and simple however, quality is not suitable for 
monte carlo or anything which requires high quality uniform
random variable.
