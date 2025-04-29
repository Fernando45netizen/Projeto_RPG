package Classes;
public class Colonizador extends Classes {
@Override
public String getPassivas() {
    // TODO Auto-generated method stub
    return "O Colonizador tem o instinto de firmar posição em qualquer terreno desconhecido, transformando o ambiente hostil em vantagem própria.\n" + //
     "\n" + //
     "Efeito:\n" + //
     "➔ Sempre que o Colonizador entra em um novo território (floresta, vila abandonada, ruínas, sertão), ele ganha bônus de +2 em testes de sobrevivência, percepção e defesa enquanto permanecer lá.\n" + //
      "➔ Além disso, pode montar acampamentos ou barricadas improvisadas com metade do tempo normal.";
}
@Override
public String getHabilidades() {
    // TODO Auto-generated method stub
    return "Mão leve, convocar frota(invoca 3 soldados), cavalaria(invoca 2 cavaleiros), Espelhar habilidade do adversário";
}
    
    
}
