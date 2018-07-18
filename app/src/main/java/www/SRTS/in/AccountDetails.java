package www.SRTS.in;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
//
//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.auth.AuthCredential;
//import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class AccountDetails extends AppCompatActivity {
    EditText Name, Mobile, NewPass,CNewPass,OldPass;
    Button updateBtn;
    boolean updatePass;
    String Message= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_details);

        updatePass = false;

        Name = findViewById(R.id.Name);
        Mobile = findViewById(R.id.Phone);
        NewPass = findViewById(R.id.newPass);
        CNewPass = findViewById(R.id.cnewPass);
        OldPass = findViewById(R.id.oldpass);

        updateBtn = findViewById(R.id.updateBtn);

        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        final DatabaseReference database = FirebaseDatabase.getInstance().getReference();


        updateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.e("Error","No Error");
            }

        });

    }
}
