	public String chiffresSignificatifs (String dec, int nn) {
		int lendec = dec.length();
		int nbrZeros = nn-lendec;

		/**
			enl�ves les z�ros inutils (sans les compter au pr�alable 
			(plus simple � coder))
		**/
		dec = envleveZerosInutils (dec);

		if (nn == -1) return dec; 
		// cas de base (on enl�ve 
		// le plus de z�ros possibles, comme en maths).

		/* Ajoute des zeros si besoin */
		for (int i=0; i<nbrZeros; i++) {
			dec+='0';
		}

		return dec;
	}