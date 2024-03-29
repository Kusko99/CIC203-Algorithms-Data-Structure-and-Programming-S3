import java.util.EmptyStackException;

import javax.management.ObjectName;

import Stack.Stack;

/**
 * Implementação da interface Stack usando um arranjo de tamanho fixo
 * Uma exceção é lançada ao tentar realizar uma operação de push quando o 
 * tamanho da pilha é igual ao tamanho do arranjo. Esta classe inclui os principais
 * métodos da classe Java predefinida java.util.Stack
 */
public class ArrayStack<E> implements Stack<E> {
    protected int capacity;                     //capacidade real do arranjo da pilha
    public static final int CAPACITY = 1000;    //capacidade default do arranjo
    protected E S[];                            //arranjo genérico usado para implementar a pilha
    protected int top = -1;                     
    public ArrayStack(){
        this(CAPACITY);                         //capacidade default
    }
    public ArrayStack(int cap){
        capacity = cap;
        S = (E[]) new Object[capacity];         //o compilador deve gerar uma aviso, mas está ok
    }
    public int size(){
        return(top+1);
    }
    public boolean isEmpty(){
        return(top<0);
    }
    public void push(E element) throws FullStackException{
        if(size() == capacity)
            throw new FullStackException("Stack is full.");
        S[++top] = element;
    }
    public E top() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException("Stack is empty");
        return S[top];
    }
    public E pop() throws EmptyStackException{
        E element;
        if (isEmpty())
            throw new EmptyStackException("Stack is empty");
        element = S[top];
        S[top--] = null;    //desrefeência S[top] para o sistema de coleta de lixo
        return element;
    }
    public String toString(){
        String s;
        s = "[";
        if(size() > 0) s+= S[0];
        if(size() > 1)
        for(int i = 1; i<= size()-1;i++){
            s += "," + S[i];
        }
        return s + "]";
    }
}
