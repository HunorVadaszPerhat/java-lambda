# JAVA - lambda
## Predicate
 * test: 
   * evaluates this predicate on the given argument
   * boolean test(T t)
   *  [link](https://github.com/HunorVadaszPerhat/java-predicate/tree/main/predicate/predicate_test)
 * and:
   * returns a composed predicate that represents a short-circuiting logical AND of this predicate and another
   * default Predicate<T> and(Predicate<? super T> other)
   *  [link](https://github.com/HunorVadaszPerhat/java-predicate/tree/main/predicate/predicate_and)
 * negate:
   * returns a predicate that represents the logical negation of this predicate
   * default Predicate<T> negate()
   *  [link](https://github.com/HunorVadaszPerhat/java-predicate/tree/main/predicate/predicate_negate)
 * or: 
   * returns a composed predicate that represents a short-circuiting logical OR of this predicate and another
   * default Predicate<T> or(Predicate<? super T> other)
   *  [link](https://github.com/HunorVadaszPerhat/java-predicate/tree/main/predicate/predicate_or)
 * isEqual:
   * returns a predicate that tests if two arguments are equal according to Objects.equals(Object, Object)
   * static <T> Predicate<T> isEqual(Object targetRef)
   *  [link](https://github.com/HunorVadaszPerhat/java-predicate/tree/main/predicate/predicate_isequal)
 
## IntPredicate:
 * test: 
   * evaluates this predicate on the given argument
   * boolean test(int value)
   *  [link](https://github.com/HunorVadaszPerhat/java-predicate/tree/main/int_predicate/int_predicate_test)
 * and:
   * returns a composed predicate that represents a short-circuiting logical AND of this predicate and another
   * default IntPredicate and(IntPredicate other)
   *  [link](https://github.com/HunorVadaszPerhat/java-predicate/tree/main/int_predicate/int_predicate_and)
 * negate:
   * returns a predicate that represents the logical negation of this predicate
   * default IntPredicate negate()
   *  [link](https://github.com/HunorVadaszPerhat/java-predicate/tree/main/int_predicate/int_predicate_negate)
 * or:
   * represents a short-circuiting logical OR of this predicate and another
   * default IntPredicate or(IntPredicate other)
   *  [link](https://github.com/HunorVadaszPerhat/java-predicate/tree/main/int_predicate/int_predicate_or)

## LongPredicate
 * test:
   * evaluates this predicate on the given argument
   * boolean test(long value)
 * and:
   * returns a composed predicate that represents a short-circuiting logical AND of this predicate and another
   * default LongPredicate and(LongPredicate other)
 * negate:
   * returns a predicate that represents the logical negation of this predicate
   * default LongPredicate negate()
 * or:
   * returns a composed predicate that represents a short-circuiting logical OR of this predicate and another
   * default LongPredicate or(LongPredicate other)