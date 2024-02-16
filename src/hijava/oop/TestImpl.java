package hijava.oop;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestImpl implements TestInterface {

	@Override
	public ResultSet select(String sql) throws SQLException, IOException {
		print(sql);
		return null;
	}

}
