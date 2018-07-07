package tst.campos.util.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tst.campos.util.Searcher;

/**
 * Anotação que aponta qual é o buscador da Entidade e os critérios disponíveis
 *
 * @author Vitor
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface SpecialSearch {

	Class<? extends Searcher> searcher();

	String[] queries();
}
