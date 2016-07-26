import com.aaacpl.api.services.AuctionService;
import com.aaacpl.api.services.ParticipatorService;
import com.aaacpl.dao.AuctionDAO;
import com.aaacpl.dao.LotsDAO;
import com.aaacpl.dao.UsersDAO;
import com.aaacpl.rest.request.participator.CreateParticipatorRequest;
import com.aaacpl.rest.request.participator.ParticipatorInfo;
import com.aaacpl.util.DateUtil;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sumedh on 10-03-2016.
 */
public class Test {
    public static void main(String args[]) throws SQLException, IOException{

        new UsersDAO().getUsersList();
    }
}
