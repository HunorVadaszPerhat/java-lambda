# java-lambda

# Predicate
 * test: 
   * evaluates this predicate on the given argument
   * boolean test(T t)
 * and:
   * returns a composed predicate that represents a short-circuiting logical AND of this predicate and another
   * default Predicate<T> and(Predicate<? super T> other)