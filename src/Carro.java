class Carro {
    //Atributos - características - estados
    String marca = "Chevroleth";  
    int modelo = 2018;
    byte capacidad = 5;
    String color = "Blanco - Negro"; 
    float cilindraje = 1500;
    String placa = "RZC340";
    String colorPlaca = "Amarillo";

    //Atributos adicionales
    boolean stop = true;
    int velocidadMaxima = 200;
    int velocidadPermitida = 150;
    int velocidadActual = 0;


    // Métodos - comportamientos 
    public String informacion(){
        String info = String.format("Marca: %s\n Modelo: %s\n Capacidad: %s\n Color: %s\n Cilindraje: %s\n Placa. %s\n ColorPlaca: %s ", marca, modelo, capacidad, color, cilindraje, placa, colorPlaca);
        return info;

       // String cadena = "Marca: " + marca + "Modelo: " + modelo
    }


    public void trasladarse(){   
        System.out.println("El carro ha empezado a trasladarse");  //metodo trasladarse muestra el texto en pantalla

    }
    public void parar(){
        System.out.println("El carro se ha detenido"); // el metodo parar muestra en pantalla el texto
    }
    public void acelerar(){
        
        velocidadActual = velocidadActual + 10;
        if(velocidadActual>velocidadMaxima){
            velocidadActual = 200;
            System.out.println("No se puede acelerar... has llegado a la velocidad maxima");
        }

        else if (velocidadActual>150){
            System.out.println("El carro acelerando");
            System.out.println("Cuidado has sobrepasado el limite permitido");
            
        }else{
            System.out.println("El carro acelerando");
            
        }
        System.out.println("El carro tiene una velocidad de " + velocidadActual);
        
    }
    public void arrancar(){
        System.out.println("El carro ha arrancado");
        stop = false;
        acelerar();
        trasladarse();
    }
    public void desacelerar(){
        
        if(stop == false && velocidadActual > 0){
            velocidadActual = velocidadActual - 10;
            System.out.println("Desacelerando");
            System.out.println("El carro tiene una velocidad de " + velocidadActual);
            if(velocidadActual == 0 || velocidadActual < 0){
                stop = true;
                parar();
            }
        }
        else{
            System.out.println("No se puede desacelerar. El carro está parado");
        }
    }


}
