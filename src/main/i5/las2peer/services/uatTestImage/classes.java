package i5.las2peer.services.uatTestImage;

import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.ParseException;

public class classes {

    class image {

    public image() {}
    
    private String imageName;

    public void setimageName(String setValue) {
        this.imageName = setValue;
    }

    public String getimageName() {
        return this.imageName;
    }
    private int imageId;

    public void setimageId(int setValue) {
        this.imageId = setValue;
    }

    public int getimageId() {
        return this.imageId;
    }
    private String imageUrl;

    public void setimageUrl(String setValue) {
        this.imageUrl = setValue;
    }

    public String getimageUrl() {
        return this.imageUrl;
    }

    public JSONObject toJSON() {

        JSONObject jo = new JSONObject();
        jo.put("imageName", this.imageName); 
        jo.put("imageId", this.imageId); 
        jo.put("imageUrl", this.imageUrl); 

        return jo;
    }

    public void fromJSON(String jsonString) throws ParseException {
        JSONObject jsonObject = (JSONObject) JSONValue.parseWithException(jsonString);
        this.imageName = (String) jsonObject.get("imageName"); 
        this.imageId = ((Long) jsonObject.get("imageId")).intValue(); 
        this.imageUrl = (String) jsonObject.get("imageUrl"); 

    }

}
    class image2 {

    public image2() {}
    
    private String imageName2;

    public void setimageName2(String setValue) {
        this.imageName2 = setValue;
    }

    public String getimageName2() {
        return this.imageName2;
    }
    private String imageUrl2;

    public void setimageUrl2(String setValue) {
        this.imageUrl2 = setValue;
    }

    public String getimageUrl2() {
        return this.imageUrl2;
    }

    public JSONObject toJSON() {

        JSONObject jo = new JSONObject();
        jo.put("imageName2", this.imageName2); 
        jo.put("imageUrl2", this.imageUrl2); 

        return jo;
    }

    public void fromJSON(String jsonString) throws ParseException {
        JSONObject jsonObject = (JSONObject) JSONValue.parseWithException(jsonString);
        this.imageName2 = (String) jsonObject.get("imageName2"); 
        this.imageUrl2 = (String) jsonObject.get("imageUrl2"); 

    }

}

    
}
