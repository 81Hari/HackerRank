import math as m

def main():
    AB = int(input())
    BC = int(input())
    MBC = m.atan(AB/BC) * (180/m.pi)
    print(str(round(MBC)) +'\N{DEGREE SIGN}')

if __name__ == '__main__':
    main()

"""
    The median of a triangle is a line drawn from one of the vertices to the mid-point of the opposite side.
    In the case of a right triangle, the median to the hypotenuse has the property that its length is equal
    to half the length of the hypotenuse.

    So,
    MB = MC,
    Triangle(MBC) is isosceles,
    Angle(MBC) = Angle(ACB).
"""
