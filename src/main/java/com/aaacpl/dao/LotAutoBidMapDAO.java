package com.aaacpl.dao;

import com.aaacpl.exceptions.userServiceExceptions.UserNotFoundException;

import java.sql.*;
public class LotAutoBidMapDAO {
    public boolean insertIntoLotAutoBidMap(int lotId, int userId, Connection connection)
            throws SQLException {
        PreparedStatement preparedStatement = null;
        String query =  "INSERT INTO lot_auto_bid_map(lot_id, user_id, auto_bid_count) VALUES (?,?,?);";
        Boolean isCreated = Boolean.FALSE;
        try {
            int parameterIndex = 1;
            preparedStatement = connection
                    .prepareStatement(query);
            preparedStatement.setInt(parameterIndex++,
                    lotId);
            preparedStatement.setInt(parameterIndex++,
                    userId);

            preparedStatement.setInt(parameterIndex++, 1);

            int i = preparedStatement.executeUpdate();
            isCreated = i>0;

        } catch (SQLException sqlException) {
            connection.rollback();
            sqlException.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return isCreated;

    }

    public int getAutoBidCount(int userId, int lotId, Connection connection) throws SQLException,
            UserNotFoundException {
        Statement statement = null;
        Integer autoBidCount = -1;
        try {
            statement = connection.createStatement();
            StringBuilder query = new StringBuilder(
                    "SELECT auto_bid_count FROM lot_auto_bid_map where lot_id = ").append(lotId).append(" AND user_id = ").append(userId);
            ResultSet resultSet = statement.executeQuery(query.toString());
            while (resultSet.next()) {
                autoBidCount = resultSet.getInt("auto_bid_count");
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return autoBidCount;
    }

    public Boolean updateAutoBidCount(int lotId, int userId, int autoBidCount, Connection connection) throws SQLException {
        Boolean isUpdated = Boolean.FALSE;
        PreparedStatement preparedStatement = null;
        String query = "UPDATE lot_auto_bid_map SET auto_bid_count = ? WHERE lot_id= ? AND user_id = ?";

        try {
            int parameterIndex = 1;

            preparedStatement = connection
                    .prepareStatement(query);

            preparedStatement.setInt(parameterIndex++, autoBidCount);

            preparedStatement.setInt(parameterIndex++,
                   lotId);

            preparedStatement.setInt(parameterIndex++, userId);


            int i = preparedStatement.executeUpdate();
            isUpdated = i>0;


        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return isUpdated;

    }
}
