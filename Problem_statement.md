Problem statement:

Design, implement and test an ADT Polynomial that provides some of the basic operations for univariate polynomials.

For example, P(x) = 3x4 − 7x + 18 is such a polynomial in x.

Your ADT Polynomial should be implemented as a Circular List of terms with a header node (term consists of coefficient and exponent and a pointer to next term in the chain). The circular list representation of a polynomial has one node for each term that has non-zero coefficient. The terms are in decreasing order of exponent and the head node has its coefficient and exponent field equal to 0 and -1 respectively. The following figure gives some examples.

 

You must use the two classes Node, and Polynomial  (should be implemented as a circular structure)  to do the job:

The ADT Polynomial should support the following operations. Note that some operators should be overloaded to make your code more readable. You may add any other public/private member functions that you think are necessary.

Polynomial()

- Create the zero polynomial, that is P(x) = 0. Polynomial() is the class default constructor.

friend istream& operator>>(istream&, const Polynomial&)

- Read in a polynomial in the following form:

c1 e1 c2 e2 · · · cm em 0 − 1

where ci and ei are integers denoting the coefficient and exponent of the ith term, respectively. The last pair 0 − 1 denotes the end of polynomial. You can assume that the exponents are in decreasing order; that is e1 > e2 > . . . > em ≥ 0, and there is no zero coefficient in the input; that is ci <> 0 for all i.
