//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;

// import org.springframework.jdbc.datasource.DataSourceUtils;

//import org.springframework.jdbc.datasource.DataSourceUtils;
//
//import com.connaissant.realapp.repository.dto.FmsUnitDto;

public class HashmapPra {

	public static void main(String[] args) {

		HashMap<String, Integer> hashObjs = new HashMap<>();
		hashObjs.put("a", 1);
		hashObjs.put("b", 2);
		hashObjs.put("c", 3);
		hashObjs.put("d", 4);
		hashObjs.put("e", 5);
		hashObjs.put("f", 6);
		hashObjs.put("g", 7);
		hashObjs.put("h", 8);
		
		System.out.println(hashObjs.keySet());
		System.out.println(hashObjs);
		for (String hashObj : hashObjs.keySet()) {
			System.out.println("key is : " + hashObj + " & value is : " + hashObjs.get(hashObj));

		}

/*
 * @Override
	public HashMap<String, ArrayList<String>> getAllCodeCombs(Integer flexId) throws SQLException {
		HashMap<String, ArrayList<String>> codeLists = new HashMap<>();
		Connection con = DataSourceUtils.getConnection(dataSource);
		String query = "SELECT akfs.SEGMENT,akfs.SEGMENT_NAME FROM admin.admin_key_flexfield_segment akfs WHERE akfs.FLEXFIELD_ID = "
				+ flexId;

		Statement st = con.createStatement();
		ResultSet rst = st.executeQuery(query);
		System.out.println(query);
		while (rst.next()) {
			ArrayList<String> segMeans = new ArrayList<>();
			ArrayList<String> ConSegs = new ArrayList<>();
			ArrayList<String> actives = new ArrayList<>();
			ArrayList<String> keyFlexcombIds = new ArrayList<>();
			ArrayList<String> flexFieldIds = new ArrayList<>();
			String query2 = "SELECT DISTINCT CC_VIEW FROM admin.admin_key_flexfield_master A,admin.admin_key_flexfield B \r\n"
					+ " WHERE A.FLEXFIELD_MASTER_ID = B.FLEXFIELD_MASTER_ID AND B.FLEXFIELD_ID = " + flexId;
			Statement st2 = con.createStatement();
			ResultSet rst2 = st2.executeQuery(query2);
			System.out.println(query2);
			if (rst2.next()) {
				String query1 = "SELECT " + " " + rst.getString("SEGMENT") + "_CODE,"
						+ "       concatenated_segment,\r\n" + "      KEY_FLEXFIELD_COMB_ID,\r\n" + "       ACTIVE,\r\n"
						+ "       FLEXFIELD_ID\r\n" + " FROM " + rst2.getString("CC_VIEW") + " WHERE FLEXFIELD_ID = "
						+ flexId;
				Statement st1 = con.createStatement();
				ResultSet rst1 = st1.executeQuery(query1);
				System.out.println(query1);
				while (rst1.next()) {
					String segMean = new String();
					segMean = rst1.getString(rst.getString("SEGMENT") + "_CODE");
					segMeans.add(segMean);
					codeLists.put(rst.getString("SEGMENT_NAME"), segMeans);
					String ConSeg = new String();
					ConSeg = rst1.getString("concatenated_segment");
					ConSegs.add(ConSeg);
					codeLists.put("concagtenated_segments", ConSegs);
					String active = new String();
					active = rst1.getString("ACTIVE");
					if (active.equals("1")) {
						actives.add("true");
						codeLists.put("active", actives);
					} else {
						actives.add("false");
						codeLists.put("active", actives);
					}

					String keyFlexcombId = new String();
					keyFlexcombId = rst1.getString("KEY_FLEXFIELD_COMB_ID");
					keyFlexcombIds.add(keyFlexcombId);
					codeLists.put("key_flexfield_comb_id", keyFlexcombIds);

					String flexFieldId = new String();
					flexFieldId = rst1.getString("FLEXFIELD_ID");
					flexFieldIds.add(flexFieldId);
					codeLists.put("flexfield_id", flexFieldIds);
				}
				;
			}
			;
		}
		return codeLists;
	}
 */
		
	}
}


