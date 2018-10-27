package test1;

import java.util.ArrayList;

public class Event {
    
    protected String eventDate;
    protected double id;
    
    
    public Event(String eventDate) {
        this.eventDate = eventDate;
    }
    
    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

     public Event() {
    
    
    //eventList Class 
      ArrayList <Event> eventList = new ArrayList <Event>();
      
      //Instanciamos usuarios y contrasenas por ejemplo
      
      Event ev0 = new Event("Enero");
      eventList.add(ev0);
      
      Event ev1 = new Event("Febrero");
      eventList.add(ev1);
      
      Event ev2 = new Event("Marzo");
      eventList.add(ev2);
      
      Event ev3 = new Event("Abril");
      eventList.add (ev3);
      
      Event ev4 = new Event("Mayo");
      eventList.add(ev4);
      
      Event ev5 = new Event("Junio");
      eventList.add(ev5);
     
      Event ev6 = new Event("Julio");
      eventList.add(ev6);
      
      Event ev7 = new Event("Agosto");
      eventList.add(ev7);
      
      Event ev8 = new Event("Septiembre");
      eventList.add(ev8);
      
      Event ev9 = new Event("Octubre");
      eventList.add(ev9);
      
      Event ev10 = new Event("Noviembre");
      eventList.add(ev10);
      
      Event ev11 = new Event("Diciembre");
      eventList.add(ev11);
      
      for(int index=0; index <eventList.size(); index++){
            Event ev = eventList.get(index);
            ev.mostrar();
        } 
      
}

    /*public void mostrar(){
        System.out.println("Mes del evento:\t" +  eventDate);
        System.out.println("id:\t\t" + id);
        
    } 
    */
}
