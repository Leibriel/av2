package provav2;

import javax.swing.JOptionPane;

public class pt2 {

    public static void main(String[] args) {
        int[][] m1 = new int[2][2];
        int[] diagDir = new int[2]; 
        int[] diagInv = new int[2];
        int[] diagInv2 = new int[2];

        // LEITURA DOS NUMEROS
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
            }
        }

        // PASSA OS VALORES DA DIAGONAL INVERSA PARA UM VETOR AUXILIAR
        diagDir[0] = m1[0][0];
        diagDir[1] = m1[1][1];
        diagDir[2] = m1[2][2];

        // PASSA OS VALORES DA DIAGONAL DIRETA PARA UM VETOR AUXILIAR
        diagInv[0] = m1[0][2];
        diagInv[1] = m1[1][1];
        diagInv[2] = m1[2][0];
        
        // DUPLICA A DIAGONAL INVERSA PARA NAO PERDER OS VALORES QDO FOREM SER TROCADOS
        diagInv2 = diagInv;
        
        // PASSA OS VALORES DA DIAGONAL DIREITA P/ DIAGONAL INVERSA
        diagInv = diagDir;

        // PASSA OS VALORES DA DIAGONAL INVERSAP/ DIAGONAL DIREITA
        diagDir = diagInv2;

        //FORMA A NOVA MATRIZ
        m1[0][0] = diagDir[0];
        m1[1][1] = diagDir[1];
        m1[2][2] = diagDir[2];
        m1[0][2] = diagInv[0];
        m1[2][0] = diagInv[2];
        
        // ESCREVE A NOVA MATRIZ
        String novaMatriz = "";
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
               novaMatriz += m1[i][j] + " ";    
            }
            novaMatriz += "\n";
        }
        System.out.println(novaMatriz);
    }
}
