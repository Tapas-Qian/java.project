package chapter08.ChangeReferencetoValue.Part2;

public class Currency {
	private String _code;

	public Currency(String _code) {
		super();
		this._code = _code;
	}

	public String get_code() {
		return _code;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_code == null) ? 0 : _code.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Currency other = (Currency) obj;
		if (_code == null) {
			if (other._code != null)
				return false;
		} else if (!_code.equals(other._code))
			return false;
		return true;
	}
	
	
}
