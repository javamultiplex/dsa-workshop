# Arithmetic Progressions
If ‘a’ is the first term and ‘d’ is the common difference
- nth term of an AP = a + (n-1)*d.
- Arithmetic Mean = Sum of all terms in the AP / Number of terms in the AP.
- Sum of ‘n’ terms of an AP = 0.5 n (first term + last term) = 0.5 n [ 2a + (n-1) d ].

# Geometric Progressions

If ‘a’ is the first term and ‘r’ is the common ratio
- nth term of a GP = a*r^(n-1).
- Geometric Mean = nth root of product of n terms in the GP.
- Sum of ‘n’ terms of a GP (r < 1) = [a*(1 – r^n)] / [1 – r].
- Sum of ‘n’ terms of a GP (r > 1) = [a*(r^n – 1)] / [r – 1].
- Sum of infinite terms of a GP (r < 1) = (a) / (1 – r).

# Quadratic Equation

A quadratic equation is a second-order polynomial equation of a variable say x. The general form of a quadratic equation is given as:

a*x^2 + b*x + c = 0

Where a,b and c are real known values and,
a can't be zero.

A quadratic equation has two roots. The roots of a quadratic equation can be easily obtained using the quadratic formula:
roots = (-b ± √(b2 - 4ac))/2a

There arises three cases as described below while finding the roots of a quadratic equation:
- If b2 < 4ac, then roots are complex
(not real).
For example roots of x2 + x + 1, roots are
-0.5 + i1.73205 and -0.5 - i1.73205

- If b2 = 4ac, then roots are real
and both roots are same.
For example, roots of x2 - 2x + 1 are 1 and 1

- If b2 > 4ac, then roots are real
and different.
For example, roots of x2 - 7x - 12 are 3 and 4
  
# Permutation

Permutation is the different arrangements of a given number of elements taken one by one, or some, or all at a time. 
For example, if we have two elements A and B, then there are two possible arrangements, AB and BA.

Number of permutations when 'r' elements are arranged out of a total of 'n' elements is n P r = n! / (n - r)!.

For example, let n = 4 (A, B, C and D) and r = 2 (All permutations of size 2). The answer is 4!/(4-2)! = 12. The twelve permutations are AB, AC, AD, BA, BC, BD, CA, CB, CD, DA, DB and DC.

Important Properties of Permutation:
- n P n = n*(n-1)*(n-2)*......*1 = n!.
- n P 0 = n! / n! = 1.
- n P 1 = n.
- n P n-1 = n!.
- n P r/n P r-1 = n - r + 1.

Permutation with **repetition** allowed: The number of permutation or arrangements of N numbers with repetition allowed will be N^N. For Example, permutations of {1,2} with repetitions will be {{1,1}, {1,2}, {2,1},{2,2}}.

Permutation with **duplicates**: The number of permutations or arrangements of N objects of which p1 are of one kind, p2 are of second kind, ..., pk are of k-th kind and the rest if any, are of different kinds is: N! / (p1! * p2! *....*pk!).

# Combination

Combination is the different selections of a given number of elements taken one by one, or some, or all at a time. For example, if we have two elements A and B, then there is only one way to 00select two items, we select both of them.

Number of combinations when 'r' elements are selected out of a total of 'n' elements is n C r = n! / [ (r !) * (n - r)! ]. For example, let n = 4 (A, B, C and D) and r = 2 (All combinations of size 2). The answer is 4!/((4-2)!*2!) = 6. The six combinations are AB, AC, AD, BC, BD, CD.

Important Properties of Combination:
- n C 0 = n C n = 1.
- n C r = n C n-r.
- n C r + n C r-1 = n+1 C r.
- n * n-1 C r-1 = (n - r + 1)* n C r-1.


