package APSaula5;

public class ValidaCarro {
//1. campo id, aceitar somente n�mero acima de 0
	public boolean validaIdCarro(int id)  {
		if (id <= 0) {
			return false;
		}
		return true;

	}
//2. campo modelo, obrigat�rio, m�ximo de caracteres 20
	public boolean validaModelCarro(String modelo)  {

		if (modelo.length() < 21) {
			return true;
		}
		return false;

	}
//3. campo marca, obrigat�rio, aceitar somente os valores (VW, GM)
	public boolean validaMarcaCarro(String marca)  {

		if (marca.equals("VW") || marca.equals("GM") || marca.equals("vw") || marca.equals("gm")) {
			return true;
		}
		return false;

	}
//4. campo placa, obrigat�rio, total de caracteres deve ser igual a 8. Ex: IEV-7889
	public boolean validaPlacaCarro(String placa)  {

		if (placa.length() == 8) {
			return true;
		}
		return false;

	}
//5. campo ano Fabrica��o, obrigat�rio, aceitar somente n�meros acima de 1980
	public boolean validaAnoFabricacao(int ano)  {

		if (ano > 1980) {
			return true;
		}
		return false;
	}
//7. campo valor total,  somente n�meros, entre 1 � 50.000
	public boolean validaPrecoFabricacao(float valor)  {

		if (valor >= 1 && valor <= 50000) {
			return true;
		}
		return false;
	}

}
