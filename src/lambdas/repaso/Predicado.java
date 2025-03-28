package lambdas.repaso;

@FunctionalInterface
public interface Predicado<T> {
	
	boolean test(T t);
}
