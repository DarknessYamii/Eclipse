package objetos;

	public class Coche {
	
		private String marca;
		private String modelo;
		
		public Coche() {
			marca = "Ford";
			modelo = "Focus";
		}
		
		public Coche(String mar, String mod) {
			marca = mar;
			modelo = mod;
			
		}
	
		public String getMarca() {
			return marca;
		}
	
		public void setMarca(String marca) {
			this.marca = marca;
		}
	
		public String getModelo() {
			return modelo;
		}
	
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
	
	}
