public class Paciente {
double pesoEmQuilos,alturaEmMetros,IMC;
String faixaDeValores;
    public void calcularIMC (){
        IMC = pesoEmQuilos/(alturaEmMetros*alturaEmMetros);
        
    }
     
    public void diaginostico (){
      this.calcularIMC();
        if ((IMC <= 24.99)&&(IMC>=0)){
            if ((IMC >= 0)&& (IMC<16)){
                faixaDeValores = "Baixo peso muito grave";
            }
            if ((IMC>=16)&&(IMC <= 16.99)){
                faixaDeValores = "Baixo peso grave";
            }
            if ((IMC>= 17)&&(IMC <= 18.49)){
                faixaDeValores = "Baixo peso";
            }
            if ((IMC >= 18.50)&&(IMC<=24.99)){
                faixaDeValores = "Peso normal";
            }
            
        }else {
            if ((IMC >= 25 )&&(IMC <=29.99 )){
                faixaDeValores = "Sobrepeso ";
            }
            if ((IMC >=30 )&&(IMC <= 34.99)){
                faixaDeValores = "Obesidade grau I ";
            } 
            if ((IMC >= 35)&&(IMC <=39.99)){
                faixaDeValores = "Obesidade grau II ";
            }
            if ((IMC >= 40 )){
                faixaDeValores = "Obesidade grau III (obesidade mórbida)";
            }
        }
    }
}