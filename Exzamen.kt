class Exzamen(data:String)
{
    var name="Unnamed"
    var predm="Unnamed"
    var datae="Unnamed"
    var bal=0
    var dopbon=0
    var konrez="Unnamed"
    init
    {
        datae=data
    }
    fun Input (exzamen: Exzamen)
    {
        try
        { println("Введите имя студента")
            exzamen.name = readLine()!!.toString()
            do
            {
                println("Выберите предмет (математика, русский, биология, физика, английский, химия)")
                exzamen.predm =readLine()!!.toString()
            }while(exzamen.predm !="математика"&&exzamen.predm !="русский"&&exzamen.predm!="биология"&&exzamen.predm!="физика"&&exzamen.predm!="английский"&&exzamen.predm!="химия")
            do
            {
                println("Какую оценку за экзамен поставите ученику (1,2,3,4,5)?")
                exzamen.bal=readLine()!!.toInt()
            }while (exzamen.bal!=1&&exzamen.bal!=2&&exzamen.bal!=3&&exzamen.bal!=4&&exzamen.bal!=5)

        }catch (e:Exception)
        {
            println("Введен символ");
        }
    }

    fun Output(exzamen: Exzamen)
    {
        println("\nИмя студента: ${exzamen.name} \nПредмет: ${exzamen.predm} \nДата экзамена: ${exzamen.datae}")
    }
}