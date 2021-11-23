/*-------------------------------------------------------------
// AUTHOR: Arjun Singh Thakur
// ASU ID: 1221536394
// FILENAME: Lab10
// SPECIFICATION: description of the program
//-----------------------------------------------------------*/

import java.io.*;

class Lab10
{
    public static void main(String[] args)
    {
        //declare necessary variables here
        String firstName, lastName;
        double test1, test2, test3, test4, average, sum = 0.0;
        try {
                System.out.print("\nEnter text file name: ")
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String fileName = reader.readLine();

                // #1: create a File object called 'fo' based on above fileName
                File fo = new File(fileName);

                //#2: create a FileReader object called 'fr' by using above object created in #1
                Filereader fr = new FileReader(fo);

                // #3: create a BufferedReader object called 'br' by using the FileReader object created in #2
				BufferedReader br = new BufferedReader(fr);

				System.out.print("\n====== CSE110 Report ======");
				System.out.print("\nName     Test Average");

				String line = br.readLine();

				//while not reach to the end of the file
				while(line != null )
				{
				    //process data line by line
				    String[] tokenizedLine = originalLine.split("[,\t]");

				    lastName = String.parseString(tokenizedLine[0]);
					firstName = String.parseString(tokenizedLine[1]);
					test1 = Double.parseDouble(tokenizedLine[2]);
					test2 = Double.parseDouble(tokenizedLine[3]);
					test3 = Double.parseDouble(tokenizedLine[4]);
					test4 = Double.parseDouble(tokenizedLine[5]);

					//do the computation, compute sum, average and output



				    //read in the next line until to the end
				    line = br.readLine();
				} //end while

            }
        catch(IOException e)
        {
            System.out.println(e);
        }
    } //end main()
}//end class