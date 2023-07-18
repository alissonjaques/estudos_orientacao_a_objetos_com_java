package acervo;

import Relatorios.Relatorio;
import cartazes.Cartaz;
import enums.StatusDoItem;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import livros.Livro;
import mapas.Mapa;
import midias.CDs;
import midias.DVDs;
import midias.Fitas;
import midias.VHS;
import periodicos.Jornal;
import periodicos.Revista;
import trabalhosDeConclusao.Dissertacao;
import trabalhosDeConclusao.Monografia;
import trabalhosDeConclusao.Tese;

/**
 *
 * @author licin
 */
public class BibliotecaDeMetodos {
    
    public static CDs[] listaDeCDsDoAcervo(){
        CDs listaCds[] = new CDs[5];
        
        String faixaDetonaltas[] = new String[11];
        faixaDetonaltas[0] = "1. O Amanhã";
        faixaDetonaltas[1] = "2. Nada Vai Mudar";
        faixaDetonaltas[2] = "3. O Dia que Não Terminou";
        faixaDetonaltas[3] = "4. Mercador de Almas";
        faixaDetonaltas[4] = "5. Só por Hoje";
        faixaDetonaltas[5] = "6. Com Você";
        faixaDetonaltas[6] = "7. Silêncio";
        faixaDetonaltas[7] = "8. Meu Bem";
        faixaDetonaltas[8] = "9. Tênis Roque";
        faixaDetonaltas[9] = "10. Tô Aprendendo a Viver sem Você";
        faixaDetonaltas[10] = "11. Send U Back";
       
        String faixaTheBeatles[] = new String[13];
        faixaTheBeatles[0] = "1. Yellow Submarine";
        faixaTheBeatles[1] = "2. Only a Northern Song";
        faixaTheBeatles[2] = "3. All Together Now";
        faixaTheBeatles[3] = "4. Hey Bulldog";
        faixaTheBeatles[4] = "5. It's All Too Much";
        faixaTheBeatles[5] = "6. All You Need Is Love";
        faixaTheBeatles[6] = "7. Pepperland";
        faixaTheBeatles[7] = "8. Sea of Time";
        faixaTheBeatles[8] = "9. Sea of Holes";
        faixaTheBeatles[9] = "10. Sea of Monsters";
        faixaTheBeatles[10] = "11. March of the Meanies";
        faixaTheBeatles[11] = "12. Pepperland Laid Waste";
        faixaTheBeatles[12] = "13. Yellow Submarine in Pepperland";
        
        String faixaLegiaoUrbana[] = new String[14];
        faixaLegiaoUrbana[0] = "1. Vinte e Nove";
        faixaLegiaoUrbana[1] = "2. A Fonte";
        faixaLegiaoUrbana[2] = "3. Do Espírito";
        faixaLegiaoUrbana[3] = "4. Perfeição";
        faixaLegiaoUrbana[4] = "5. O Passeio da Boa Vista";
        faixaLegiaoUrbana[5] = "6. O Descobrimento do Brasil";
        faixaLegiaoUrbana[6] = "7. Os Barcos";
        faixaLegiaoUrbana[7] = "8. Vamos Fazer um Filme";
        faixaLegiaoUrbana[8] = "9. Os Anjos";
        faixaLegiaoUrbana[9] = "10. Um Dia Perfeito";
        faixaLegiaoUrbana[10] = "11. Giz";
        faixaLegiaoUrbana[11] = "12. Love in Afternoon";
        faixaLegiaoUrbana[12] = "13. La Nuova Gioventú";
        faixaLegiaoUrbana[13] = "14. Só Por Hoje";
        
        String faixaTheStrokes[] = new String[11];
        faixaTheStrokes[0] = "1. What Ever Happened?";
        faixaTheStrokes[1] = "2. Reptilia";
        faixaTheStrokes[2] = "3. Automatic Stop";
        faixaTheStrokes[3] = "4. 12:51";
        faixaTheStrokes[4] = "5. You Talk Way Too Much";
        faixaTheStrokes[5] = "6. Between Love & Hate";
        faixaTheStrokes[6] = "7. Meet Me in the Bathroom";
        faixaTheStrokes[7] = "8. Under Control";
        faixaTheStrokes[8] = "9. The Way It Is";
        faixaTheStrokes[9] = "10. The End Has No End";
        faixaTheStrokes[10] = "11. I Can't Win";
        
        String faixaCaetanoVeloso[] = new String[10];
        faixaCaetanoVeloso[0] = "1. Lua de São Jorge";
        faixaCaetanoVeloso[1] = "2. Oração ao Tempo";
        faixaCaetanoVeloso[2] = "3. Beleza Pura";
        faixaCaetanoVeloso[3] = "4. Menino do Rio";
        faixaCaetanoVeloso[4] = "5. Vampiro";
        faixaCaetanoVeloso[5] = "6. Elegia";
        faixaCaetanoVeloso[6] = "7. Trilhos Urbanos";
        faixaCaetanoVeloso[7] = "8. Louco por Você";
        faixaCaetanoVeloso[8] = "9. Cajuína";
        faixaCaetanoVeloso[9] = "10. Aracajú";
        
        CDs detonaltas = new CDs("Roque Marciano","X01",(short)2004,StatusDoItem.DISPONÍVEL,
                "Detonaltas","Warner Music Brasil",(byte)1,faixaDetonaltas);
        listaCds[0] = detonaltas;
        
        CDs beatles = new CDs("Yellow Sumarine","X02",(short)1969,StatusDoItem.DISPONÍVEL,
                "The Beatles","Apple Records",(byte)1,faixaTheBeatles);
        listaCds[1] = beatles;
        
        CDs legiaoUrbana = new CDs("O Descobrimento do Brasil","X03",(short)1993,StatusDoItem.DISPONÍVEL,
                 "Legião Urbana","EMI-Odeon",(byte)1,faixaLegiaoUrbana);
        listaCds[2] = legiaoUrbana;
        
        CDs theStrokes = new CDs("Room on Fire","X04",(short)2003,StatusDoItem.DISPONÍVEL,
                "The Strokes","RCA",(byte)1,faixaTheStrokes);
        listaCds[3] = theStrokes;
        
        CDs caetanoVeloso = new CDs("Cinema Transcendental","X05",(short)1979,StatusDoItem.DISPONÍVEL,
                "Caetano Veloso","PolyGram Studios",(byte)1,faixaCaetanoVeloso);
        listaCds[4] = caetanoVeloso;
        
        return listaCds;
    }
    
    public static Fitas[] listaDeFitasDoAcervo(){
        Fitas listaFitas[] = new Fitas[3];
        
        String faixaEngenheirosDoHawaii[] = new String[11];
        faixaEngenheirosDoHawaii[0] = "1. A Revolta dos Dândis I";
        faixaEngenheirosDoHawaii[1] = "2. Terra de Gigantes";
        faixaEngenheirosDoHawaii[2] = "3. Infinita Highway";
        faixaEngenheirosDoHawaii[3] = "4. Refrão de Bolero";
        faixaEngenheirosDoHawaii[4] = "5. Filmes de Guerra, Canções de Amor";
        faixaEngenheirosDoHawaii[5] = "6. A Revolta dos Dândis II";
        faixaEngenheirosDoHawaii[6] = "7. Além de Outdoors";
        faixaEngenheirosDoHawaii[7] = "8. Vozes";
        faixaEngenheirosDoHawaii[8] = "9. Quem Tem Pressa não se Interessa";
        faixaEngenheirosDoHawaii[9] = "10. Desde Aquele Dia";
        faixaEngenheirosDoHawaii[10] = "11. Guardas da Fronteira";
        
        String faixaTheBeatles[] = new String[12];
        faixaTheBeatles[0] = "1. Two of Us";
        faixaTheBeatles[1] = "2. Dig a Pony";
        faixaTheBeatles[2] = "3. Across the Universe";
        faixaTheBeatles[3] = "4. I Me Mine";
        faixaTheBeatles[4] = "5. Dig It";
        faixaTheBeatles[5] = "6. Let it Be";
        faixaTheBeatles[6] = "7. Maggie Mae";
        faixaTheBeatles[7] = "8. I've Got a Feeling";
        faixaTheBeatles[8] = "9. One After 909";
        faixaTheBeatles[9] = "10. The Long and Winding Road";
        faixaTheBeatles[10] = "11. For You Blue";
        faixaTheBeatles[11] = "12. Get Back";
        
        String faixaNirvana[] = new String[13];
        faixaNirvana[0] = "1. Smells Like Teen Spirit";
        faixaNirvana[1] = "2. In Bloom";
        faixaNirvana[2] = "3. Como as You Are";
        faixaNirvana[3] = "4. Breed";
        faixaNirvana[4] = "5. Lithium";
        faixaNirvana[5] = "6. Polly";
        faixaNirvana[6] = "7. Territorial Pissings";
        faixaNirvana[7] = "8. Drain You";
        faixaNirvana[8] = "9. Lounge Act";
        faixaNirvana[9] = "10. Stay Way";
        faixaNirvana[10] = "11. On a Plain";
        faixaNirvana[11] = "12. Something in the Way";
        faixaNirvana[12] = "13. Endless, Nameless";
                
        Fitas engenheirosDoHawaii = new Fitas("A Revolta dos Dândis","Y01",(short)1987,StatusDoItem.DISPONÍVEL,
                "Engenheiros do Hawaii","BMG",(byte)1,faixaEngenheirosDoHawaii);
        listaFitas[0] = engenheirosDoHawaii;
        
        Fitas beatles = new Fitas("Let It Be","Y02",(short)1970,StatusDoItem.DISPONÍVEL,
                "The Beatles","Apple Records",(byte)1,faixaTheBeatles);
        listaFitas[1] = beatles;
        
        Fitas nirvana = new Fitas("Nevermind","Y03",(short)1991,StatusDoItem.DISPONÍVEL,
                 "Nirvana","DGC",(byte)1,faixaNirvana);
        listaFitas[2] = nirvana;
        
        return listaFitas;
    }
    
    public static VHS[] listasDeVHSDoAcervo(){
        VHS listaVHS[] = new VHS[6];
        
        VHS reiLeao = new VHS("O Rei Leão","V01",(short)1994,StatusDoItem.DISPONÍVEL,
                "Roger Allers e Rob Minkoff","Walt Disney Pictures",(byte)1,1.48);
        listaVHS[0] = reiLeao;
        
        VHS aHoraDoPesadelo = new VHS("A Hora do Pesadelo","V02",(short)1986,StatusDoItem.DISPONÍVEL,
                "Wes Craven","New Line Cinema",(byte)0,1.51);
        listaVHS[1] = aHoraDoPesadelo;
        
        VHS malditasAranhas = new VHS("Malditas Aranhas","V03",(short)2002,StatusDoItem.DISPONÍVEL,
                "Ellory Elkayem","Warner Bros",(byte)1,1.65);
        listaVHS[2] = malditasAranhas;
        
        VHS homemAranha = new VHS("Homem Aranha","V04",(short)2002,StatusDoItem.DISPONÍVEL,
                "Sam Raimi","Coumbia Pictures",(byte)1,2.07);
        listaVHS[3] = homemAranha;
        
        VHS aMumia = new VHS("A Múmia","V05",(short)1999,StatusDoItem.DISPONÍVEL,
                "Stephen Sommers","Universal Pictures",(byte)1,2.08);
        listaVHS[4] = aMumia;
        
        VHS formandosUFMG011981 = new VHS("Colação de Grau Engenheria Elétrica","V06",
                (short)1981,StatusDoItem.DISPONÍVEL,"Rômulo Almeida","UFMG Stúdios",(byte)1,1.0);
        listaVHS[5] = formandosUFMG011981;
        
        return listaVHS;
    }
    
    public static DVDs[] listaDeDVDsDoAcervo(){
        DVDs listaDVDs[] = new DVDs[5];
        
        DVDs harryPotter01 = new DVDs("Harry Potter e a Pedra Filosofal","D01",
                (short)2001,StatusDoItem.DISPONÍVEL,"Chris Columbus","Warner Bros",(byte)1,2.53,true);
        listaDVDs[0] = harryPotter01;
        
        DVDs aprendizDeSonhador = new DVDs("Aprendiz de Sonhador","D02",
                (short)1993,StatusDoItem.DISPONÍVEL,"Lasse Hallstrom","Paramount Pictures",(byte)1,1.96,true);
        listaDVDs[1] = aprendizDeSonhador;
        
        DVDs documentarioBBC = new DVDs("The Big Question","D03",
                (short)2008,StatusDoItem.DISPONÍVEL,"Sigmond Mayer","BBC Studios",(byte)1,1.0,false);
        listaDVDs[2] = documentarioBBC;
        
        DVDs oAviador = new DVDs("O Aviador","D04",
                (short)2004,StatusDoItem.DISPONÍVEL,"Martin Scorsese","Warner Bros",(byte)1,2.83,true);
        listaDVDs[3] = oAviador;
        
        DVDs documentarioBBC2 = new DVDs("Inteligência Artificial","D05",
                (short)2015,StatusDoItem.DISPONÍVEL,"Alfred Holmes","BBC Studios",(byte)1,2.00,true);
        listaDVDs[4] = documentarioBBC2;        
        
        return listaDVDs;
    }
    
    public static Jornal[] listaDeJornaisDoAcervo() throws ParseException{
        Jornal listaJornais[] = new Jornal[5];
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        //formato.parse("23/11/2015")
        
        Jornal jornal1 = new Jornal("O Globo","J01",(short)2017,StatusDoItem.DISPONÍVEL,"Globo",formato.parse("01/11/2017"),
                "NY tem primeiro atentado com mortes desde o 11 de Setembro",(int)12,(short)16,"Roberto Marinho");
        listaJornais[0] = jornal1;
        
        Jornal jornal2 = new Jornal("A Gazeta do Povo","J02",(short)2011,StatusDoItem.DISPONÍVEL,"Gazeta do Povo",formato.parse("20/03/2011"),
                "Passiata de Jovens Ganha Repercusão Mundial",(int)9,(short)32,"Paulo Guimarães");
        listaJornais[1] = jornal2;
        
        Jornal jornal3 = new Jornal("Estado de Minas","J03",(short)2014,StatusDoItem.DISPONÍVEL,"Estado de Minas",formato.parse("04/05/2014"),
                "Entenda tudo sobre a copa do mundo no Brasil",(int)17,(short)30,"Pedro Maraújo Fonseca");
        listaJornais[2] = jornal3;
        
        Jornal jornal4 = new Jornal("Jornal Serranense - Edição Especial","J04",(short)2021,StatusDoItem.DISPONÍVEL,"Jornal Serranense",
                formato.parse("05/06/2021"),"A atual crise do Governo Bolsonaro",(int)21,(short)18,"Maria Roberta Diziz");
        listaJornais[3] = jornal4;
        
        Jornal jornal5 = new Jornal("Folha de S.Paulo","J05",(short)2020,StatusDoItem.DISPONÍVEL,"Folha de São Paulo",formato.parse("17/03/2020"),
                "Contra vírus, governo prevê injetar R$147 bi na economia",(int)33,(short)30,"Roberto Magalhães");
        listaJornais[4] = jornal5;
        
        return listaJornais;    
    }
    
    public static Revista[] listaDeRevistasDoAcervo() throws ParseException{
        Revista listaRevistas[] = new Revista[3];        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        Revista mundoEstranho = new Revista("Mundo Estranho","R01",(short)2018,StatusDoItem.DISPONÍVEL,
                "Abril",formato.parse("17/03/2018"),"A Rebelião da Inteligência Artificial",(int)15,(short)67);
        listaRevistas[0] = mundoEstranho;
        
        Revista galileu = new Revista("Galileu","R02",(short)2015,StatusDoItem.DISPONÍVEL,
                "Globo",formato.parse("15/06/2015"),"A fontosíntese como você nunca viu",(int)17,(short)58);
        listaRevistas[1] = galileu;
        
        Revista revistaUniversitaria = new Revista("Revista Universitária - Edição Especial","R03",(short)2019,StatusDoItem.DISPONÍVEL,
                "UFMG",formato.parse("18/09/2019"),"UFMG sobe no ranque das melhores universidades do mundo",(int)13,(short)71);
        listaRevistas[2] = revistaUniversitaria;
                
        return listaRevistas;    
    }
    
    public static Relatorio[] listaDeRelatoriosDoAcervo(){
        Relatorio listaDeRelatorios[] = new Relatorio[3];
        String alunos[] = new String[3];
        String aluno1[] = new String[2];
        String aluno[] =  new String[1];
                
        aluno[0] = "Miguel da Silva Domingues";
        alunos[0] = "Pedro Miguel da Silva";
        alunos[1] = "Jéssica Pereira Damasceno";
        alunos[2] = "Rodrigo Ferreira Santos";
        aluno1[0] = "Amanda Crista Souza";
        aluno1[1] = "John Francisco de Paula";
        
        Relatorio osciladorMassaMola = new Relatorio("Prática 1 - Oscilador Massa Mola","RR01",(short)2012,StatusDoItem.DISPONÍVEL,
                aluno,"Engenharia Elétrica","Física I","José Guilherme Sabino","PUC MG","São Gabriel","Belo Horizonte MG",(short)12,1.0,
                "oscilador massa mola","massa mola","123.12:555.44");
        listaDeRelatorios[0] = osciladorMassaMola;
        
        Relatorio cinematicaRobotica = new Relatorio("Robótica - Cinemática Inversa de um Manipulador","RR02",(short)2020,StatusDoItem.DISPONÍVEL,
                alunos,"Engenharia de Controle e Automação","Robótica","Amadeus Júnior Silva","Universidade do Estado de Minas Gerais (UEMG)",
                "Divinópolis","Divinópolis MG",(short)20,2.0,"cinemática inversa","manipulador robótico","153.19:555.99");
        listaDeRelatorios[1] = cinematicaRobotica;
        
        Relatorio calorEspecifico = new Relatorio("Prática 3 - Calor Específico","RR03",(short)2018,StatusDoItem.DISPONÍVEL,
                aluno,"Engenharia da Computação","Física III","Hugo Clemente do Santos","Universidade Federal de Minas Gerais (UFMG)",
                "Pampulha","Belo Horizonte MG",(short)19,2.0,"calor específico","calor","173.42:999.54");
        listaDeRelatorios[2] = calorEspecifico;
        
        return listaDeRelatorios;
    }
    
    public static Livro[] listaDeLivrosDoAcervo(){
        Livro livros[] = new Livro[5];
        String autores[] = new String[5];
        autores[0] = "JK Rowling";
        autores[1] = "Tolkien";
        autores[2] = "Carlos Drummond de Andrade";
        autores[3] = "Charles Darwin";
        autores[4] = "Mário Quintana";
        
        Livro harryPotter = new Livro("Harry Potter e a Ordem da Fênix","L01",(short)1995,StatusDoItem.DISPONÍVEL,
                "JK Rowling",(byte)1,"Reino Unido","ROCCO",(short)704,4.0,"85-325-1622-X","Literatura Fantástica","Harry Potter e a Ordem da Fênix",
                "Harry Potter","173.92:979.74");
        livros[0] = harryPotter;
        
        Livro oSilmarillion = new Livro("O Silmarillion","L02",(short)1977,StatusDoItem.DISPONÍVEL,
                "J.R.R. Tolkien",(byte)1,"Reino Unido","Martins Fontes",(short)353,3.0,"85-336-1165-X","Literatura Fantástica","silmarillion",
                "terra média","173.84:979.45");
        livros[1] = oSilmarillion;
        
        Livro algumaPoesia = new Livro("Alguma Poesia","L03",(short)1930,StatusDoItem.DISPONÍVEL,
                "Carlos Drummond de Andrade",(byte)3,"São Paulo","Companhia das Letras",(short)120,2.0,"97-885-1165-X","Poesia Brasileira","poesia",
                "poesia livre","999.45:478.69");
        livros[2] = algumaPoesia;
        
        Livro aOrigemDasEspecies = new Livro("A Oritem das Espécies","L04",(short)1859,StatusDoItem.DISPONÍVEL,
                "Charles Darwin",(byte)2,"Reino Unido","Murray Edition",(short)502,3.0,"85-736-8854-X","Biologia Evolutiva","biologia",
                "evolução natural","654.41:429.76");
        livros[3] = aOrigemDasEspecies;
        
        Livro coletaniaMarioQuintana = new Livro("Melhores Poesias de Mário Quintana","L05",(short)1998,StatusDoItem.DISPONÍVEL,
                "Artur Canedo",(byte)1,"Rio de Janeiro","Record",(short)150,2.5,"88-736-2265-X","Poesia Brasileira","poesia",
                "poesia livre","173.84:979.45");
        livros[4] = coletaniaMarioQuintana;
        
        return livros;    
    }
    
    public static Tese[] listaDeTesesDoAcervo(){
        Tese teses[] = new Tese[3];
        String orientadores1[] = new String[2];
        String orientadores2[] = new String[2];
        String orientadores3[] = new String[2];
        
        orientadores1[0] = "Patrícia Alves Barbosa";
        orientadores1[1] = "Isaac Newton";
        
        orientadores2[0] = "Jão Paulo Paiva";
        orientadores2[1] = "Cristiane Rodrigues Silva";
        
        orientadores3[0] = "Beto Benedito da Fonseca";
        orientadores3[1] = "José Saramago Porto";
        
        Tese tese1 = new Tese("Nanotubos na Indústria","T01",(short)2017,StatusDoItem.DISPONÍVEL,"Guilherme Ferreira Silva", 
                "São Paulo SP",(byte)80,5.0,orientadores1, "Universidade Federal da Bahia", "Salvador", "Física de Partículas", 
                "nanotubos", "mecânica quânticas", "456.14:989.47");
        teses[0] = tese1;
        
        Tese tese2 = new Tese("Buracos Negros","T02",(short)2014,StatusDoItem.DISPONÍVEL,"Henrique Martins Figueiredo", 
                "Divinólis MG",(byte)75,4.5,orientadores2, "CEFET MG", "Divinópolis", "Física Teórica", 
                "buracos negros", "singuralidade", "996.17:949.48");
        teses[1] = tese2;
        
        Tese tese3 = new Tese("Redes Neurais Artificiais para Manipular Sistemas Lineares","T03",(short)2013,StatusDoItem.DISPONÍVEL,
                "Álvaro Milagres","Campinas SP",(byte)80,5.0,orientadores3, "Universidade de Campinas", "Campinas", "Redes Neurais Artificiais", 
                "redes neurais artificiais", "inteligência artificial", "476.14:769.99");
        teses[2] = tese3;
        
        return teses;
    }
    
    public static Dissertacao[] listaDeDissertacaoDoAcervo(){
        Dissertacao dissertacoes[] = new Dissertacao[3];
        String orientadores1[] = new String[2];
        String orientadores2[] = new String[2];
        String orientadores3[] = new String[2];
        
        orientadores1[0] = "Rafael Rodrigues Zeferino";
        orientadores1[1] = "Iolanda Maria das Dores";
        
        orientadores2[0] = "Maria Evangelista da Silva";
        orientadores2[1] = "Ronaldo da Fonseca";
        
        orientadores3[0] = "Hugo Fernandes Pimentel";
        orientadores3[1] = "Carlos Daniel Soares";
        
        Dissertacao dissertacao1 = new Dissertacao("Estipulando o tamanho de um quanta elementar","D01",(short)2012,StatusDoItem.DISPONÍVEL,
                "Arnaldo Soares Damasceno","São Paulo SP",(byte)80,5.0,orientadores1, "Universidade Federal da Bahia", "Salvador", "Física de Partículas", 
                "quantas elementares", "mecânica quânticas", "478.28:999.77");
        dissertacoes[0] = dissertacao1;
        
        Dissertacao dissertacao2 = new Dissertacao("Desenvolvimento de um rotor de busca de auta responsividade","D02",(short)2015,StatusDoItem.DISPONÍVEL,
                "Bruno Messias Domingues","Divinólis MG",(byte)75,4.5,orientadores2, "CEFET MG", "Divinópolis", "Rotores de Busca em Navegadores", 
                "rotores de busca", "desenvolvimento web", "741.53:746.88");
        dissertacoes[1] = dissertacao2;
        
        Dissertacao dissertacao3 = new Dissertacao("Uma nova metologia para desenvolvimento de software profissional","T03",(short)2013,StatusDoItem.DISPONÍVEL,
                "Almada Campos Cordeiro","Rio de Janeiro RJ",(byte)90,3.0,orientadores3, "Universidade do Estado do Rio de Janeiro", "Rio de Janeiro", 
                "Engenharia de Software","software profissional", "metologia de desenvolvimento de software", "741.54:456.91");
        dissertacoes[2] = dissertacao3;
        
        return dissertacoes;
    }
    
    public static Monografia[] listaDeMonografiaDoAcervo(){
        Monografia monografias[] = new Monografia[3];
        String orientadores1[] = new String[2];
        String orientadores2[] = new String[2];
        String orientadores3[] = new String[2];
        
        orientadores1[0] = "Olavo Teodoro";
        orientadores1[1] = "Giovanni Barbosa Almeida";
        
        orientadores2[0] = "Hamilton Silva Almeida";
        orientadores2[1] = "Débora Caetono Silva";
        
        orientadores3[0] = "Andressa Parreiras e Silva";
        orientadores3[1] = "Gauss Júnior da Silva";
        
        Monografia monografia1 = new Monografia("Classificação de uma ramificação do reino fungi","M01",(short)2009,StatusDoItem.DISPONÍVEL,
                "Marcelo Abre Fagundes","São Paulo SP",(byte)40,3.0,orientadores1, "Universidade Federal de Minas Gerais", "Pampulha", "Reino Biológico", 
                "reino fungi", "classificação de fungos", "418.63:979.17");
        monografias[0] = monografia1;
        
        Monografia monografia2 = new Monografia("Ampliação dos conceitos de Máquina de Turing","M02",(short)2020,StatusDoItem.DISPONÍVEL,
                "Miguel dos Santos Barbosa","Divinólis MG",(byte)75,4.5,orientadores2, "CEFET MG", "Divinópolis", "Teoria da Computação", 
                "máquinas de turing", "modelo de computador", "121.32:786.98");
        monografias[1] = monografia2;
        
        Monografia monografia3 = new Monografia("Tensores no Espaço-Tempo, uma abordagem com números complexos","M03",(short)2013,StatusDoItem.DISPONÍVEL,
                "Wolfingan Amadeus Júnior","Ouro Preto MG",(byte)50,3.3,orientadores3, "Universidade Federal de Outro Preto", "Ouro Preto", 
                "Espaço-tempo","tensores", "espaço-tempo", "731.74:996.44");
        monografias[2] = monografia3;
        
        return monografias;
    }
    
    public static Mapa[] listaDeMapasDoAcervo(){
        Mapa listaMapas[] = new Mapa[4];
        
        Mapa mapaMundi = new Mapa("Mapa Mundi","ML01",(short)2003,StatusDoItem.DISPONÍVEL,"- Savana / -- Oceano","1:500");
        listaMapas[0] = mapaMundi;
        
        Mapa americaDoSul = new Mapa("Mapa da América do Sul","ML02",(short)2020,StatusDoItem.DISPONÍVEL,"- Selva / -- Centro urbano","1:5000");
        listaMapas[1] = americaDoSul;
        
        Mapa europa = new Mapa("Mapa da Europa","ML03",(short)1997,StatusDoItem.DISPONÍVEL,"- Universidades / -- Hospitais","1:500");
        listaMapas[2] = europa;
        
        Mapa ossiriand = new Mapa("Mapa da Ossiriand - Primeira Era do Mundo","ML04",(short)100,StatusDoItem.DISPONÍVEL,"- Rio Gelion / -- Rio Duilwen","1:5000");
        listaMapas[3] = ossiriand;
        
        return listaMapas;
    }
    
    public static Cartaz[] listaDeCartazesDoAcervo(){
        Cartaz cartazes[] = new Cartaz[3];
        
        Cartaz semanaDasEngenharias = new Cartaz("Semana das Engenharias na UEMG",
                "UC01",(short)2019,StatusDoItem.DISPONÍVEL,"A semana onde a engenharia faz acontecer. De 05/06/2019 à 14/06/2019",
                "Universidade do Estado de Minas Gerais");
        cartazes[0] = semanaDasEngenharias;
        
        Cartaz entendaABiologia = new Cartaz("Por quê Escolher Biologia?",
                "UC02",(short)2012,StatusDoItem.DISPONÍVEL,"Entenda as àreas da biologia e as funções de um biólogo. De 21/07/2012 à 28/07/2012",
                "Escola Estadual Manuel Pinheiro");
        cartazes[1] = entendaABiologia;
        
        Cartaz feiraDoCalçado = new Cartaz("Feira dos Calçadistas de Nova Serrana",
                "UC03",(short)2016,StatusDoItem.DISPONÍVEL,"A maior feira de calçados do brasil. De 11/04/2016 à 18/04/2016",
                "Prefeitura de Nova Serrana MG");
        cartazes[2] = feiraDoCalçado;
        
        return cartazes;
    }
}
