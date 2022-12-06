//contrato autenticado
//quem assina esse contrato, precisa implementar 
    //setSenha
    //autentica
public abstract interface Auntenticavel{
    

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}
