# java-lambda

# Predicate
 * test: 
   * evaluates this predicate on the given argument
   * boolean test(T t)
 * and:
   * returns a composed predicate that represents a short-circuiting logical AND of this predicate and another
   * default Predicate<T> and(Predicate<? super T> other)
 * negate:
   * returns a predicate that represents the logical negation of this predicate
   * default Predicate<T> negate()
 * or: 
   * returns a composed predicate that represents a short-circuiting logical OR of this predicate and another
   * default Predicate<T> or(Predicate<? super T> other)
 * isEqual:
   * returns a predicate that tests if two arguments are equal according to Objects.equals(Object, Object)
   * static <T> Predicate<T> isEqual(Object targetRef)
 