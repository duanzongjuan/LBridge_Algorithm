class Rational {
	private long _a;  //分子
	private long _b;  //分母

	public Rational() {
		_a = 1;
		_b = 1;
	}

	//最大公约数(碾除法)
	private static long _gcd(long x, long y) {
		if(x < 0) x = -x;
		if(y < 0) y = -y;
		if(y == 0) return x;
		return _gcd(y,x%y);
	}

	public Rational(long a, long b) {
		long d = _gcd(a, b);
		_a = a/d; 
		_b = b/d;
	}

	//加法
	public Rational add(Rational x) {
		return new Rational(this._a * x._b + this._b * x._a, _b * x._b);	
	}

	//乘法
	public Rational mul(Rational x) {
		return new Rational(this._a * x._a,this._b * x._b);
	}

	//相反数
	public Rational negative() {
		return new Rational(-this._a,this._b);
	}

	//减法
	public Rational sub(Rational x) {
		return add(x.negative());
	}

	//倒数
	public Rational inverse() {
		return new Rational(this._b, this._a);
	}

	//除法
	public Rational div(Rational x) {
		return mul(x.inverse());
	}

	public String toString() {
		if(_b == 1) {
			return "" + _a;
		} else {
			return _a + "/" + _b;
		}
	}

	public static void main(String[] args) {
		Rational a = new Rational(5,1);
		Rational b = new Rational(1,15);

		Rational c = a.add(b);
		Rational d = a.div(b);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}