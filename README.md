Write a program using c, c++, or java that have four dynamic memory partitions of size 100 KB, 500 KB, 200 KB, and 450 KB. The program should accept from user the number of processes and their sizes. Then output the assignment of processes using the next fit algorithm (specifying which process, if any, is block).

Program must be able to be compiled in gcc/g++/javac without any errors. [i.e. You will receive zero if, there are errors within compilation]

Remember:
Next fit is a modified version of ‘first fit’. It begins as the first fit to find the first free partition but when called next time it starts searching from where it left off, not from the beginning.
