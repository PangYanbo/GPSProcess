package PTdata;

	public enum ETransport {
		/**	�ړ����[�h�؍�	*/	STAY(99),
		/**	�ړ����[�h�k��	*/	WALK(1),
		/**	�ړ����[�h��	*/	VEHICLE(2),
		/**	�ړ����[�h���	*/	TRAIN(3);
		
		private final int id;

		private ETransport(int id){
			this.id = id;
		}
		public int getId(){
			return this.id;
		}
		public static ETransport valueOf(int id){
			for (ETransport num : values()){
				if (num.getId() == id){
					return num;
				}
			}
			return null;
		}
	}

