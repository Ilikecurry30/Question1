public class Appointmentbook {
    public int findFreeBlock(int period, int duration)
{
    for(int startMinute = 0; startMinute <= 59; startMinute++)
    {
        int endMinute = startMinute + duration - 1;

        if(endMinute > 59)
            return -1;

        boolean isFree = true;

        for(int minute = startMinute; minute <= endMinute; minute++)
            if( ! isMinuteFree(period, minute) )
                isFree = false;

        if(isFree)
            return startMinute;
    }

    return -1;
}

    public boolean makeAppointment(int startPeriod, int endPeriod,
                               int duration)
{
    for(int period = startPeriod; period <= endPeriod; period++)
    {
        int startMinute = findFreeBlock(period, duration);

        if(startMinute != -1)
        {
            reserveBlock(period, startMinute, duration);
            return true;
        }
    }

    return false;
}

    private boolean isMinuteFree(int period, int minute) {
    return true; 
}

private void reserveBlock(int period, int startMinute, int duration) {
}
    
}
