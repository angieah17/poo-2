package lambdas.repaso;

@FunctionalInterface
public interface BiPredicado<T, U> {
	
	boolean test(T t, U u);
	
}
