package com.acme.flight.analysis.filter;


/**
 * Filters the data
 *
 * @author Ashok.Koyi
 *
 * @param <T> Input type to be filtered
 */
public interface Filter<T> {
  /**
   * Applies the filter to the input data
   * 
   * @param t data to apply filter to
   */
  void apply(T t);
}
