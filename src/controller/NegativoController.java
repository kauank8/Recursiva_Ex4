package controller;

public class NegativoController {
	public int calculaNegativo(int vt[], int tamanho, int n) {
		//condiçao de parada
		
				if(tamanho == 0) {
					return n;
				}else {
					tamanho--;
					if(vt[tamanho]<0) {
						 n++;
					}
				}
				return calculaNegativo(vt,tamanho,n);
			}

}
