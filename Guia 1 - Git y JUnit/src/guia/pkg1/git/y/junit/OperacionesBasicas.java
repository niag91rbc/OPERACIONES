package guia.pkg1.git.y.junit; 

public class OperacionesBasicas{ 
    private int a,b; 

    public OperacionesBasicas(int a, int b){ 
        this.a = a; 
        this.b = b; 
    } 

    public OperacionesBasicas(){}     
    
    public int sumar(){ 
               
        if((a==0 || b==0)){
            System.out.println("0");
        }else{
            
        }
        return this.a+this.b;      
    }
    
    public int resta(){ 
        
        if((b>a)){
            System.out.println("0");
        }else{
            
        }        
        return this.a-this.b; 
    }
    
    public int multiplicar(){ 
        if((b==0)){
            System.out.println("1");
        }else{
            
        }
        return this.a*this.b; 
    } 
    
    public int dividir(){
        if(b==0){
            System.out.println("0");
        }else{
            
        }
        return this.a/this.b; 
    } 
} 
