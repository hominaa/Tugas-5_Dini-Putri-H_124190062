package id.ac.upnyk.databaselokal.view;

import android.view.View;

import java.util.List;

import id.ac.upnyk.databaselokal.entity.AppDatabase;
import id.ac.upnyk.databaselokal.entity.DataKampus;

public interface MainContact {
    interface view extends View.OnClickListener{
        void successAdd();
        void successDelete();
        void resetForm();
        void getData(List<DataKampus> list);
        void editData(DataKampus item);
        void deleteData(DataKampus item);
    }

    interface presenter{
        void insertData(String nama, String alamat, int jumlah, AppDatabase database);
        void readData(AppDatabase database);
        void editData(String nama, String alamat, int jumlah, int id, AppDatabase database);
        void deleteData(DataKampus dataKampus, AppDatabase database);
    }
}
