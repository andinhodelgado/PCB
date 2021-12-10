package br.com.usinasantafe.pcb.view;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import br.com.usinasantafe.pcb.PCBContext;
import br.com.usinasantafe.pcb.R;
import br.com.usinasantafe.pcb.model.dao.LogProcessoDAO;

public class DigBagCarregActivity extends ActivityGeneric {

    private PCBContext pcbContext;
    private ProgressDialog progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dig_bag_carreg);

        pcbContext = (PCBContext) getApplication();

        Button buttonOkBag = findViewById(R.id.buttonOkPadrao);
        Button buttonCancBag = findViewById(R.id.buttonCancPadrao);
        Button buttonAtualPadrao = findViewById(R.id.buttonAtualPadrao);

        buttonAtualPadrao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LogProcessoDAO.getInstance().insertLogProcesso("buttonAtualPadrao.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "AlertDialog.Builder alerta = new AlertDialog.Builder(DigBagCarregActivity.this);\n" +
                        "                alerta.setTitle(\"ATENÇÃO\");\n" +
                        "                alerta.setMessage(\"DESEJA REALMENTE ATUALIZAR BASE DE DADOS?\");", getLocalClassName());
                AlertDialog.Builder alerta = new AlertDialog.Builder(DigBagCarregActivity.this);
                alerta.setTitle("ATENÇÃO");
                alerta.setMessage("DESEJA REALMENTE ATUALIZAR BASE DE DADOS?");
                alerta.setNegativeButton("SIM", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        LogProcessoDAO.getInstance().insertLogProcesso("alerta.setNegativeButton(\"SIM\", new DialogInterface.OnClickListener() {\n" +
                                "                    @Override\n" +
                                "                    public void onClick(DialogInterface dialog, int which) {", getLocalClassName());

                        if (connectNetwork) {

                            LogProcessoDAO.getInstance().insertLogProcesso("if (connectNetwork) {\n" +
                                    "progressBar = new ProgressDialog(DigBagCarregActivity.this);\n" +
                                    "                            progressBar.setCancelable(true);\n" +
                                    "                            progressBar.setMessage(\"ATUALIZANDO ...\");\n" +
                                    "                            progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);\n" +
                                    "                            progressBar.setProgress(0);\n" +
                                    "                            progressBar.setMax(100);\n" +
                                    "                            progressBar.show();", getLocalClassName());
                            progressBar = new ProgressDialog(DigBagCarregActivity.this);
                            progressBar.setCancelable(true);
                            progressBar.setMessage("ATUALIZANDO ...");
                            progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                            progressBar.setProgress(0);
                            progressBar.setMax(100);
                            progressBar.show();

                            LogProcessoDAO.getInstance().insertLogProcesso("pcbContext.getConfigCTR().atualDados(DigBagCarregActivity.this, DigFuncActivity.class, progressBar, \"Func\", 1, getLocalClassName());", getLocalClassName());
                            pcbContext.getConfigCTR().atualDados(DigBagCarregActivity.this, DigFuncActivity.class, progressBar, "Func", 1, getLocalClassName());

                        } else {

                            LogProcessoDAO.getInstance().insertLogProcesso("AlertDialog.Builder alerta = new AlertDialog.Builder( OperadorActivity.this);\n" +
                                    "                            alerta.setTitle(\"ATENÇÃO\");\n" +
                                    "                            alerta.setMessage(\"FALHA NA CONEXÃO DE DADOS. O CELULAR ESTA SEM SINAL. POR FAVOR, TENTE NOVAMENTE QUANDO O CELULAR ESTIVE COM SINAL.\");\n" +
                                    "                            alerta.setPositiveButton(\"OK\", new DialogInterface.OnClickListener() {\n" +
                                    "                                @Override\n" +
                                    "                                public void onClick(DialogInterface dialog, int which) {\n" +
                                    "                                }\n" +
                                    "                            });\n" +
                                    "                            alerta.show();", getLocalClassName());
                            AlertDialog.Builder alerta = new AlertDialog.Builder(DigBagCarregActivity.this);
                            alerta.setTitle("ATENÇÃO");
                            alerta.setMessage("FALHA NA CONEXÃO DE DADOS. O CELULAR ESTA SEM SINAL. POR FAVOR, TENTE NOVAMENTE QUANDO O CELULAR ESTIVE COM SINAL.");
                            alerta.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            alerta.show();

                        }


                    }
                });

                alerta.setPositiveButton("NÃO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        LogProcessoDAO.getInstance().insertLogProcesso("alerta.setPositiveButton(\"NÃO\", new DialogInterface.OnClickListener() {\n" +
                                "                    @Override\n" +
                                "                    public void onClick(DialogInterface dialog, int which) {", getLocalClassName());
                    }
                });
                alerta.show();

            }

        });

        buttonOkBag.setOnClickListener(new View.OnClickListener() {
            @SuppressWarnings("rawtypes")
            @Override
            public void onClick(View v) {

                LogProcessoDAO.getInstance().insertLogProcesso("buttonOkMotorista.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @SuppressWarnings(\"rawtypes\")\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {", getLocalClassName());
                if (!editTextPadrao.getText().toString().equals("")) {

                    LogProcessoDAO.getInstance().insertLogProcesso("if (!editTextPadrao.getText().toString().equals(\"\")) {", getLocalClassName());
                    if(pcbContext.getCarregCTR().verBagCarregCodBarra(editTextPadrao.getText().toString())){

                        LogProcessoDAO.getInstance().insertLogProcesso("if (pmmContext.getMotoMecFertCTR().verFunc(Long.parseLong(editTextPadrao.getText().toString()))) {\n" +
                                "pmmContext.getMotoMecFertCTR().getBoletimMMFertDAO().setBoletimMMBean();\n" +
                                "                        pmmContext.getMotoMecFertCTR().getBoletimMMFertDAO().getBoletimMMFertBean().setMatricFuncBolMMFert(Long.parseLong(editTextPadrao.getText().toString()));", getLocalClassName());
                        pcbContext.getCarregCTR().inserirItemCarreg(editTextPadrao.getText().toString(), getLocalClassName());

                        LogProcessoDAO.getInstance().insertLogProcesso("Intent it = new Intent(OperadorActivity.this, EquipActivity.class);", getLocalClassName());
                        Intent it = new Intent(DigBagCarregActivity.this, ListaBagCarregActivity.class);
                        startActivity(it);
                        finish();

                    } else {

                        LogProcessoDAO.getInstance().insertLogProcesso("} else {\n" +
                                "AlertDialog.Builder alerta = new AlertDialog.Builder(OperadorActivity.this);\n" +
                                "                        alerta.setTitle(\"ATENÇÃO\");\n" +
                                "                        alerta.setMessage(\"NUMERAÇÃO DO OPERADOR INEXISTENTE! FAVOR VERIFICA A MESMA.\");\n" +
                                "                        alerta.setPositiveButton(\"OK\", new DialogInterface.OnClickListener() {\n" +
                                "                            @Override\n" +
                                "                            public void onClick(DialogInterface dialog, int which) {\n" +
                                "                            }\n" +
                                "                        });\n" +
                                "                        alerta.show();", getLocalClassName());
                        AlertDialog.Builder alerta = new AlertDialog.Builder(DigBagCarregActivity.this);
                        alerta.setTitle("ATENÇÃO");
                        alerta.setMessage("NUMERAÇÃO DO BAG INEXISTENTE! FAVOR VERIFICA A MESMA.");
                        alerta.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                        alerta.show();

                    }
                }

            }

        });

        buttonCancBag.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                LogProcessoDAO.getInstance().insertLogProcesso("buttonCancBag.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "if (editTextPadrao.getText().toString().length() > 0) {\n" +
                        "                    editTextPadrao.setText(editTextPadrao.getText().toString().substring(0, editTextPadrao.getText().toString().length() - 1));\n" +
                        "                }", getLocalClassName());
                if (editTextPadrao.getText().toString().length() > 0) {
                    editTextPadrao.setText(editTextPadrao.getText().toString().substring(0, editTextPadrao.getText().toString().length() - 1));
                }
            }
        });

    }

    public void onBackPressed() {
        LogProcessoDAO.getInstance().insertLogProcesso("public void onBackPressed() {\n" +
                "Intent it = new Intent(DigBagCarregActivity.this, ListaBagCarregActivity.class);", getLocalClassName());
        Intent it = new Intent(DigBagCarregActivity.this, ListaBagCarregActivity.class);
        startActivity(it);
        finish();
    }

}