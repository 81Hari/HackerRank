N = int(input())
A = set(map(int,input().split()))
M = int(input())
B = set(map(int,input().split()))

print(len(A|B)) #Union, Alternate method to find union is A.union(B)
print(len(A&B)) #Intersection, Alternate method to find intersection A.intersection(B)
print(len(A-B)) #Elemnets only in Set A, Alternate method to difference A.difference(B)
print(len(B-A)) #Elemnets only in Set B, Alternate method to difference B.difference(A)
print(len(A^B)) #Elements only in either Set A or Set B Alternate method to symmetric difference A.symmetric_difference(B)

"""
A |= B  Alternate A.update(B)
A &= B  Alternate A.intersection_update(B)
A -= B  Alternate A.differnce_update(B)
A ^= B  Alternate A.symmetric_differnce_update(B)
"""

"""
To add
A.add()

"""

"""
To remove elements

A.pop()
A.discard()
A.remove()
"""
