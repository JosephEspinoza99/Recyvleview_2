import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.recyvleview.R;

class AdaptadorNoticias extends ArrayAdapter<Noticia> {
    public AdaptadorNoticias(Context context, Noticia[] datos) {
        super(context, R.layout.lista_bonita, datos);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.lista_bonita, null);
        TextView lblTitulo = (TextView)item.findViewById(R.id.Titulo);
        lblTitulo.setText(getItem(position).getTitulo());
        TextView lblSubtitulo = (TextView)item.findViewById(R.id.SubTitulo);
        lblSubtitulo.setText(getItem(position).getSubtitulo());
        return(item);
    }
}
