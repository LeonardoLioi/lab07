package it.unibo.inner.api;

import java.util.Iterator;
import java.util.Vector;
import it.unibo.inner.api.Predicate;

public class IterableWithPolicyImpl<T> implements IterableWithPolicy<T>{

        private final T vector[];
        private Predicate<T> filter;

        public IterableWithPolicyImpl(T[] elements){
            this.vector = elements;
            Predicate<T> t = new Predicate<T>();
            
            IterableWithPolicyImpl(elements, true);

        }
        public IterableWithPolicyImpl(T []vector, Predicate<T> filter){
            this.vector = vector;
            this.filter = filter;

        }


        public void setIterationPolicy(Predicate<T> filter){ 

            
        }

        
        static class VectorIterator<T> implements Iterator<T>{

            private final T vector[];
            private int current;
            public VectorIterator(final T vector[]){
                this.vector = vector;
                this.current = 0;

            }
            public T next(){
                return this.vector[current++];
            }
            public boolean hasNext(){

                return this.vector.length > this.current;
            }

        }

        @Override
        public Iterator<T> iterator() {
             return new VectorIterator<T>(this.vector);
        }


        
       

        
        
        

      
    
}
