public class Stack {
    /**
     * Interface para uma pilha: uma coleção de objetos
     * que são inseridos e removidos de acordo com o princípio de o último que entra é o
     * primeiro que sai. Esta interface inclui os principais métodos de Java.util.Stack
     */
    public interface Stack <E>{
        /**
         * Retorna o número de elementos na pilha 
         * @return número de elementos na pilha
         * */
        public int size();
        /**
         * Indica quando a pilha está vazia
         * @return true se a pilha é vazia, false em caso contrário
         */
        public boolean isEmpty();
        /**
         * Inspeciona o elemento no topo da pilha
         * @return o elemento no topo da pilha
         * @exception EmptyStackException se a pilha estiver vazia
         */
        public E top()
        throws EmptyStackException;
        /**
         * Insere um elemento no topo da pilha
         * @param elemento a ser inserido
         */
        public void push(E element);
        /**
         * Remove o elemento no topo da pilha
         * @return elemento a ser removido
         * @exception EmptyStackException se a pilha estiver vazia
         */
        public E pop()
        throws EmptyStackException;
    }
}
