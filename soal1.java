//Created by Hanifsyah Solehuddin Nazir
public class soal1{
	public static void main (String[]args){

		int pukul1 = 14; //Kita set waktu paling awal dari Rafaela
		int jarakR = 0; //Deklarasi dan inisialisasi jarak Rafaela
		int jarakN = 0; //Deklarasi dan inisialisasi jarak Nana
		int temp=1000; //Counter untuk memberhentikan perulangan

					for (int i = 0; i<=temp; i++ ) { //perulangan dengan banyak tempx
						pukul1 = pukul1+1; //Menambahkan Pukul per 1 perulangan
						if (pukul1 >= 15) { // dipukul 14 rafaela bergerak dan di pukul 15 rafaela sudah berada di titik bebeda dengan jarak 10m lebih dari titik awal dan seterusnya
							jarakR= jarakR + 10;
						}
						else{

						}
						if (pukul1 >= 16) { // dipukul 15 Nana baru bergerak dan dipukul 16 Nana sudah berada di titik bebeda dengan jarak 13m lebih dari titik awal dan seterusnya
							jarakN = jarakN + 13;
						}
						else {

						}
						if( jarakN > jarakR ){ //jika nana sudah membalap rafaela makan akan di print pukul berapa nana membalap
							i = temp;//Counter Temp
							System.out.print("Nana Mulai membalap Rafaela dipukul " + pukul1 + " Dengan jarak Nana adalah " + jarakN + "m " + " Dan jarak Rafaela adalah " + jarakR + "m ");

					 }
					 else{

					 }
					}


	}

}
