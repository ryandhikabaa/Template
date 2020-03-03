package com.example.template.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.template.R;
import com.example.template.model.SiswaModel;

import java.util.List;

public class SiswaADapter extends  RecyclerView.Adapter<SiswaADapter.MyViewHolder> {

    private Context mContext;
    private List<SiswaModel> mData;

    public SiswaADapter(Context mContext, List<SiswaModel> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.list_row_siswa, parent, false);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final SiswaModel siswa = mData.get(position);

        holder.nama.setText(siswa.getNamaSiswa());//
        holder.alamat.setText(siswa.getAlamat());//
        holder.kelas.setText(siswa.getKelas());//
        holder.jurusan.setText(siswa.getJurusan());//
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    @Override
    public long getItemId(int position) {
        return (long) position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nama , alamat, kelas, jurusan;

        MyViewHolder(View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.namaSiswa);
            alamat = itemView.findViewById(R.id.alamat);
            kelas = itemView.findViewById(R.id.kelas);
            jurusan = itemView.findViewById(R.id.jurusan);
        }
    }
}
