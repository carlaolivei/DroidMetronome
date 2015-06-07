package app.com.droidmetronome.control;

import app.com.droidmetronome.model.Compasso;


/**
 * Classe responsável por preparar e executar o metronomo.
 */
public class Executer {

    private Compasso compasso;

    /**
     * Pre-execução do metronomo , definindo sons e valores.
     * @param conversor - Objeto responsável por armazenar os valores definidos na interface.
     * @see FrontConversor
     */
    public void preExecuter(FrontConversor conversor){
        this.compasso = conversor.toCompasso();
        //====================================

    }

    /**
     * Define a prioridade da Thread e executa o metronomo
     */
    public void onExecuter(){

        compasso.setPriority(Thread.MIN_PRIORITY);
        compasso.start();
    }

    /**
     * Encerra o metronomo, finalizando todos os sons.
     */
    public void stopExecuter(){
        if(this.compasso != null){
            this.compasso.stopMetronomo();
            this.compasso = null;
        }
    }
}