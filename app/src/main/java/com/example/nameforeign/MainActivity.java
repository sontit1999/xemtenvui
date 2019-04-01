package com.example.nameforeign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.BitSet;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText edtname,edtNgaySinh,edtThangSinh,edtNamSinh;
    Button btnXemTen;
    TextView txtTenLao,txtTenkorea,txtTenVietNam;
    ArrayList<String> arrHokorea = new ArrayList<>();
    ArrayList<String> arrDemkorea = new ArrayList<>();
    ArrayList<String> arrTenkorea = new ArrayList<>();
    ArrayList<String> arrHolao = new ArrayList<>();
    ArrayList<String> arrdemlao = new ArrayList<>();
    ArrayList<String> arrTenlao = new ArrayList<>();
    ArrayList<String> arrHoVn = new ArrayList<>();
    ArrayList<String> arrdemVn = new ArrayList<>();
    ArrayList<String> arrTenVn = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        btnXemTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name,ngaysinh,thangsinh,namsinh;
                name = edtname.getText().toString();
                ngaysinh = edtNgaySinh.getText().toString();
                thangsinh = edtThangSinh.getText().toString();
                namsinh = edtNamSinh.getText().toString();

                if(ngaysinh.equals("") || thangsinh.equals("") || namsinh.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Ko dc bo trong", Toast.LENGTH_SHORT).show();
                }else{
                    int ngays = Integer.parseInt(ngaysinh);
                    int thangs = Integer.parseInt(thangsinh);
                    int nams = Integer.parseInt(namsinh);
                    if(ngays <= 0 || ngays > 31){
                        Toast.makeText(MainActivity.this, "Ngày sinh không hợp lệ", Toast.LENGTH_SHORT).show();
                    }else if(thangs <= 0 || thangs > 12){
                        Toast.makeText(MainActivity.this, "Tháng sinh không hợp lệ", Toast.LENGTH_SHORT).show();
                    }else if(nams <= 0 || nams > 2019){
                        Toast.makeText(MainActivity.this, "Năm sinh không hợp lệ", Toast.LENGTH_SHORT).show();
                    }else{
                        getdata();
                        String yournameTienglao,yournameTiengHan,yournametiengdantoc ;
                        int socuoinamsinh = nams%10;
                        yournameTiengHan = arrHokorea.get(socuoinamsinh) + " " + arrDemkorea.get(thangs-1) + " " + arrTenkorea.get(ngays-1);
                        txtTenkorea.setText(yournameTiengHan);
                        yournameTienglao = arrHolao.get(socuoinamsinh) + " " + arrdemlao.get(thangs-1) + " " + arrTenlao.get(ngays-1);
                        txtTenLao.setText(yournameTienglao);
                        yournametiengdantoc = arrHoVn.get(socuoinamsinh) + " " + arrdemVn.get(thangs-1) + " " + arrTenVn.get(ngays-1);
                        txtTenVietNam.setText(yournametiengdantoc);
                    }
                }

            }
        });
    }

    private void anhxa() {
        edtname = (EditText) findViewById(R.id.name);
        edtNgaySinh = (EditText) findViewById(R.id.editTextNgaySinh);
        edtThangSinh = (EditText) findViewById(R.id.editTextThangSinh);
        edtNamSinh  = (EditText) findViewById(R.id.editTextNamSinh);
        btnXemTen = (Button) findViewById(R.id.buttonXemten);
        txtTenkorea = (TextView) findViewById(R.id.textviewTenHan);
        txtTenLao = (TextView) findViewById(R.id.textviewTenLao);
        txtTenVietNam = (TextView) findViewById(R.id.textviewVietNam);
    }
    public void getdata()
    {
        // add họ ở đây. số cuối của năm sinh là họ
        arrHokorea.add("Park");
        arrHokorea.add("Kim");
        arrHokorea.add("Shin");
        arrHokorea.add("Song");
        arrHokorea.add("Kang");
        arrHokorea.add("Han");
        arrHokorea.add("Lee");
        arrHokorea.add("Sung");
        arrHokorea.add("Jung");
        arrHokorea.add("Chu");
        // add tên đệm ở đây.Tên đệm là tháng sinh
        arrDemkorea.add("Yong");
        arrDemkorea.add("Ji");
        arrDemkorea.add("Je");
        arrDemkorea.add("Hang");
        arrDemkorea.add("Dong");
        arrDemkorea.add("Sang");
        arrDemkorea.add("Ha");
        arrDemkorea.add("Hyo");
        arrDemkorea.add("Soo");
        arrDemkorea.add("Eun");
        arrDemkorea.add("Hyun");
        arrDemkorea.add("Rae");
        //add tên ở đây.Tên là ngày sinh
        arrTenkorea.add("Hwa");
        arrTenkorea.add("Woo");
        arrTenkorea.add("Joon");
        arrTenkorea.add("Hee");
        arrTenkorea.add("Kyo");
        arrTenkorea.add("Kyung");
        arrTenkorea.add("Wook");
        arrTenkorea.add("Jin");
        arrTenkorea.add("Jae");
        arrTenkorea.add("Hoon");
        arrTenkorea.add("Ra");
        arrTenkorea.add("Bin");
        arrTenkorea.add("Jin");
        arrTenkorea.add("Sun");
        arrTenkorea.add("Ri");
        arrTenkorea.add("Soo");
        arrTenkorea.add("Rim");
        arrTenkorea.add("Ae");
        arrTenkorea.add("Neul");
        arrTenkorea.add("Mun");
        arrTenkorea.add("In");
        arrTenkorea.add("Mi");
        arrTenkorea.add("Ki");
        arrTenkorea.add("Sang");
        arrTenkorea.add("Byung");
        arrTenkorea.add("Seok");
        arrTenkorea.add("Gun");
        arrTenkorea.add("Yoo");
        arrTenkorea.add("Sup");
        arrTenkorea.add("Won");
        arrTenkorea.add("Sub");
        // ten LAo
        arrTenlao.add("﻿Mủ");
        arrTenlao.add("Vổ");
        arrTenlao.add("Móm");
        arrTenlao.add("Trĩ");
        arrTenlao.add("Xin");
        arrTenlao.add("Thoắt");
        arrTenlao.add("Tòe");
        arrTenlao.add("Vẩu");
        arrTenlao.add("Lác");
        arrTenlao.add("Quẩy");
        arrTenlao.add("Mắn");
        arrTenlao.add("Vảy");
        arrTenlao.add("Bát");
        arrTenlao.add("Nhổ");
        arrTenlao.add("Phỉ");
        arrTenlao.add("Xỉ");
        arrTenlao.add("Phây");
        arrTenlao.add("Tẻn");
        arrTenlao.add("Nản");
        arrTenlao.add("Chóe");
        arrTenlao.add("Kói");
        arrTenlao.add("Lốn");
        arrTenlao.add("Chàm");
        arrTenlao.add("Ven");
        arrTenlao.add("Bón");
        arrTenlao.add("Khoai");
        arrTenlao.add("Hủi");
        arrTenlao.add("Quăn");
        arrTenlao.add("Xém");
        arrTenlao.add("Xịt");
        arrTenlao.add("Lít");
        // ho lao
        arrHolao.add("﻿Xỉn Bựa");
        arrHolao.add("Phỏi");
        arrHolao.add("Nòi");
        arrHolao.add("Khăn");
        arrHolao.add("Khạc");
        arrHolao.add("Nhổ Toẹt");
        arrHolao.add("Thạc Xoay");
        arrHolao.add("Phăn");
        arrHolao.add("Xoăn Tít");
        arrHolao.add("Củ Lều");
        // ten dem lao
        arrdemlao.add("﻿Tày Xô");
        arrdemlao.add("Khơ Mú");
        arrdemlao.add("Nùng");
        arrdemlao.add("Min Chều");
        arrdemlao.add("Páp Lịt");
        arrdemlao.add("Gảy Kua");
        arrdemlao.add("Tu Gây");
        arrdemlao.add("Vắt Xổ");
        arrdemlao.add("Mổ Kò");
        arrdemlao.add("Náng Phổn");
        arrdemlao.add("Kạ Rịt");
        arrdemlao.add("Lò Kịt");
        // ten viet nam
        arrTenVn.add("﻿Búa");
        arrTenVn.add("Nhão");
        arrTenVn.add("Nghé");
        arrTenVn.add("Nhụ");
        arrTenVn.add("èn");
        arrTenVn.add("Tòi");
        arrTenVn.add("éo");
        arrTenVn.add("Thọt");
        arrTenVn.add("Thòn");
        arrTenVn.add("Mẹc");
        arrTenVn.add("Nỡ");
        arrTenVn.add("Bé ba");
        arrTenVn.add("Gờm");
        arrTenVn.add("Khạp");
        arrTenVn.add("Nhái");
        arrTenVn.add("Sò");
        arrTenVn.add("Mực");
        arrTenVn.add("Hù");
        arrTenVn.add("Mùng");
        arrTenVn.add("Thùi");
        arrTenVn.add("Đíu");
        arrTenVn.add("Yểu");
        arrTenVn.add("Tọt");
        arrTenVn.add("Hến");
        arrTenVn.add("Nổ");
        arrTenVn.add("Hán");
        arrTenVn.add("Mắm");
        arrTenVn.add("Sạt");
        arrTenVn.add("Bóng");
        arrTenVn.add("Móng");
        arrTenVn.add("Mén");
        // ho vn
        arrHoVn.add("﻿Đạp");
        arrHoVn.add("Dãnh");
        arrHoVn.add("Danh");
        arrHoVn.add("Bành");
        arrHoVn.add("Nạo");
        arrHoVn.add("Đù");
        arrHoVn.add("Cầu");
        arrHoVn.add("Tỏi");
        arrHoVn.add("Chão");
        arrHoVn.add("Ngọ");
        // dem vn
        arrdemVn.add("﻿Thị");
        arrdemVn.add("Hôi");
        arrdemVn.add("Trùm");
        arrdemVn.add("Cùi");
        arrdemVn.add("Nhòi");
        arrdemVn.add("Dăng");
        arrdemVn.add("Tàn");
        arrdemVn.add("Lũng");
        arrdemVn.add("Cạp");
        arrdemVn.add("Cà");
        arrdemVn.add("Mạc");
        arrdemVn.add("Xì");
    }
}
