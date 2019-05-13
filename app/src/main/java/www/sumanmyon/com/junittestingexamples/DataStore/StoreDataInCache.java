package www.sumanmyon.com.junittestingexamples.DataStore;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class StoreDataInCache {
    JSONArray array;
    //StandardDataStore dataStore;
    //ArrayList<StandardDataStore> dataStoreArrayList;

    public StoreDataInCache(JSONArray array){
        this.array = array;
        //dataStoreArrayList = new ArrayList<>();
    }
    public void store() {
        for(int i=0; i<array.length();i++){
            try {

                JSONObject object = array.getJSONObject(i);
                String id = object.getString("id");
                String position = object.getString("type");
                String url = object.getString("url");
                String start_date = object.getString("created_at");
                String company = object.getString("company");
                String company_url = object.getString("company_url");
                String location = object.getString("location");
                String title = object.getString("title");
                String description = object.getString("description");
                String how_to_apply = object.getString("how_to_apply");
                String company_logo = object.getString("company_logo");

//                dataStore = new StandardDataStore();
//                dataStore.setId(id);
//                dataStore.setPosition(position);
//                dataStore.setUrl(url);
//                dataStore.setCompany(company);
//                dataStore.setCompanyLogo(company_logo);
//
//               dataStoreArrayList.add(dataStore);

            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
    }

//    public ArrayList<StandardDataStore> getDataStoreArrayList() {
//        return dataStoreArrayList;
//    }
}
