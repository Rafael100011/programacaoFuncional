package model_entities;

public class Accont {

		private Integer numero;
		private String titular;
		private Double saldo;
		private Double limiteSaque;
		
		public Accont() {
		}

		public Accont(Integer numero, String titular, Double saldo, Double limiteSaque) {
			this.numero = numero;
			this.titular = titular;
			this.saldo = saldo;
			this.limiteSaque = limiteSaque;
		}

		public Integer getNumero() {
			return numero;
		}

		public void setNumero(Integer numero) {
			this.numero = numero;
		}

		public String getTitular() {
			return titular;
		}

		public void setTitular(String titular) {
			this.titular = titular;
		}

		public Double getSaldo() {
			return saldo;
		}

		
		public Double getLimiteSaque() {
			return limiteSaque;
		}

		public void setLimiteSaque(Double limiteSaque) {
			this.limiteSaque = limiteSaque;
		}
		
		public Double deposit(Double quantia) {
			 saldo = saldo + quantia;
			 return saldo;
		}
		
		public Double saque(Double quantia) throws DomainException{
			if (quantia > limiteSaque ) {
				throw new DomainException("Error! quantia maior que Limite de Saque: DomainExcetion");
			}
			else if (quantia > saldo) {
				throw new DomainException("Error! Você não tem saldo suficiente: DomainException");
			}else {
			saldo = saldo - quantia;
			return saldo;
		}
		}

		
}
