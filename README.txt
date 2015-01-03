Euakarn (Som) Liengtiraphan
CSC 172
Project 5: SkipLists

********************************************* Data Organization ****************************************************************


The program works through the readpages class. This class read a single URL and and leads to a page of more URLs. It uses a 
buffered reader to read each line of url. It then opens a new readurl class. This readurl class will open the text file,
read the entire line (it goes line by line) and split the line by the spaces to create words. It words is then inserted
into the SKIPLIST. Because it is a skiplist, the insertion is done quickly and all the words are alphabetized creating
a list that is easily assessible and searchable. Once the SKIPLIST is created, it is then inserted into an array of SKIPLIST.
At the same time, this SKIPLIST is also being added into a large joint word count that adds all the SKIPLISTS into a larger
SKIPLIST to create a joint word count were the nodes are going to be all the distinct words in all the texts. Lastly, Findmax
method takes the joint word count list and the indiviual word count list and compares them to find the highest frequency
unique word. It does so by first finding a frequency that is bigger than the maximum and making sure it is unique
by comparing it to the joint list, if the joint list has the same frequency then it is unique. 



********************************************* Skip List Statistics***************************************************************

The skip list operates at a O(log n) rate because it halfs the amount needs to search each time because it can skip forward
in the array. By skipping forward it is bypassing a lot of poins, about half, because the heights are generated using a 
50/50 chance, creating a height at is about avarge of the level below.


********************************************* Extra Credit ****************************************************************

I have created in my skip list an auto-sizing component. It works by having a current height variable and a height varibale. As
that heights are being made it starts at the bottom and goes up. If the current height variable is more than the height
variable, then it creates a new layer. 

NOTE: I think mine goes really fast amd I've really proud of it.


*********************************************** Sample Output ******************************************************************

Reading And Processing Please Wait(x87)

            molluscs       9 http://www.csug.rochester.edu/172/5_skiplists/texts/2000010.txt

             defarge     280 http://www.csug.rochester.edu/172/5_skiplists/texts/2city11.txt

            pyncheon     300 http://www.csug.rochester.edu/172/5_skiplists/texts/7gabl10.txt

              latian      83 http://www.csug.rochester.edu/172/5_skiplists/texts/aeneid.txt

               bhaer      75 http://www.csug.rochester.edu/172/5_skiplists/texts/alcott-little-261.txt

          bellegarde     388 http://www.csug.rochester.edu/172/5_skiplists/texts/ameri10.txt

             vronsky     779 http://www.csug.rochester.edu/172/5_skiplists/texts/anna_karenina

              prissy      18 http://www.csug.rochester.edu/172/5_skiplists/texts/anne11.txt

                esdr    1323 http://www.csug.rochester.edu/172/5_skiplists/texts/apoc10.txt

                fogg     581 http://www.csug.rochester.edu/172/5_skiplists/texts/atw80d.txt

           knightley     337 http://www.csug.rochester.edu/172/5_skiplists/texts/austen-emma-754.txt

               darcy     401 http://www.csug.rochester.edu/172/5_skiplists/texts/austen-pride-757.txt

            marianne     490 http://www.csug.rochester.edu/172/5_skiplists/texts/austen-sense-758.txt

            lavendar     129 http://www.csug.rochester.edu/172/5_skiplists/texts/avon10.txt

               selah      75 http://www.csug.rochester.edu/172/5_skiplists/texts/bible10.txt

          thornfield      99 http://www.csug.rochester.edu/172/5_skiplists/texts/bronte-jane-178.txt

          heathcliff     378 http://www.csug.rochester.edu/172/5_skiplists/texts/bronte-wuthering-179.txt

                ione     439 http://www.csug.rochester.edu/172/5_skiplists/texts/bulwer-last-566.txt

           assignats      24 http://www.csug.rochester.edu/172/5_skiplists/texts/burke-reflections-307.txt

                 abu     266 http://www.csug.rochester.edu/172/5_skiplists/texts/burton-arabian-363.txt

            theobald     396 http://www.csug.rochester.edu/172/5_skiplists/texts/butler-way-362.txt

             adeline      52 http://www.csug.rochester.edu/172/5_skiplists/texts/byron-don-315.txt

      pgetextsongtxt       1 http://www.csug.rochester.edu/172/5_skiplists/texts/cather-song-367.txt

                 hym     644 http://www.csug.rochester.edu/172/5_skiplists/texts/chaucer-canterbury-102.txt

              gawain     144 http://www.csug.rochester.edu/172/5_skiplists/texts/chivalry

                itam      78 http://www.csug.rochester.edu/172/5_skiplists/texts/conrad-lord-373.txt

              coggan     134 http://www.csug.rochester.edu/172/5_skiplists/texts/crowd10a.txt

                NONE       0 http://www.csug.rochester.edu/172/5_skiplists/texts/dana-two-378.txt                           0 http://www.csug.rochester.edu/172/5_skiplists/texts/dana-two-378.txt

                xury      31 http://www.csug.rochester.edu/172/5_skiplists/texts/defoe-robinson-103.txt

             stirner      69 http://www.csug.rochester.edu/172/5_skiplists/texts/der_einz.txt

            freeland      31 http://www.csug.rochester.edu/172/5_skiplists/texts/douglass-my-637.txt

          septemberi      12 http://www.csug.rochester.edu/172/5_skiplists/texts/dracula.txt

                NONE       0 http://www.csug.rochester.edu/172/5_skiplists/texts/dreiser-sister-393.txt                           0 http://www.csug.rochester.edu/172/5_skiplists/texts/dreiser-sister-393.txt

             soulsby     120 http://www.csug.rochester.edu/172/5_skiplists/texts/dware10.txt

                loki      29 http://www.csug.rochester.edu/172/5_skiplists/texts/fable

           allworthy     600 http://www.csug.rochester.edu/172/5_skiplists/texts/fielding-history-243.txt

          phillotson     191 http://www.csug.rochester.edu/172/5_skiplists/texts/hardy-jude-132.txt

           dartagnan     982 http://www.csug.rochester.edu/172/5_skiplists/texts/ironmask

            touchett     339 http://www.csug.rochester.edu/172/5_skiplists/texts/james-portrait-134.txt

            sneffels      50 http://www.csug.rochester.edu/172/5_skiplists/texts/journey.txt

                 kim     815 http://www.csug.rochester.edu/172/5_skiplists/texts/kipling-kim-149.txt

               vizir      88 http://www.csug.rochester.edu/172/5_skiplists/texts/lang-arabian-200.txt

             valjean    1047 http://www.csug.rochester.edu/172/5_skiplists/texts/lesms10.txt

            limbrtxt       1 http://www.csug.rochester.edu/172/5_skiplists/texts/limbr10.txt

            everhard      58 http://www.csug.rochester.edu/172/5_skiplists/texts/london-iron-204.txt

          brissenden     107 http://www.csug.rochester.edu/172/5_skiplists/texts/london-martin-768.txt

            mugridge      77 http://www.csug.rochester.edu/172/5_skiplists/texts/london-sea-206.txt

              homais     177 http://www.csug.rochester.edu/172/5_skiplists/texts/madambov.txt

           rushworth     184 http://www.csug.rochester.edu/172/5_skiplists/texts/mansf11.txt

            henchard     647 http://www.csug.rochester.edu/172/5_skiplists/texts/mayrc11.txt

               trina     718 http://www.csug.rochester.edu/172/5_skiplists/texts/mcteg10.txt

             lydgate     857 http://www.csug.rochester.edu/172/5_skiplists/texts/mdmar10.txt

               stubb     233 http://www.csug.rochester.edu/172/5_skiplists/texts/melville-moby-106.txt

            korykory     108 http://www.csug.rochester.edu/172/5_skiplists/texts/melville-typee-107.txt

                NONE       0 http://www.csug.rochester.edu/172/5_skiplists/texts/moon10.txt                           0 http://www.csug.rochester.edu/172/5_skiplists/texts/moon10.txt

            moonatxt       3 http://www.csug.rochester.edu/172/5_skiplists/texts/moon10a.txt

          betteredge     307 http://www.csug.rochester.edu/172/5_skiplists/texts/mston11.txt

            eustacia     449 http://www.csug.rochester.edu/172/5_skiplists/texts/nativ11.txt

              jadwin     507 http://www.csug.rochester.edu/172/5_skiplists/texts/norris-pit-224.txt

             elfride     663 http://www.csug.rochester.edu/172/5_skiplists/texts/pblue10.txt

                etta     209 http://www.csug.rochester.edu/172/5_skiplists/texts/phillips-susan-402.txt

               aztec     222 http://www.csug.rochester.edu/172/5_skiplists/texts/prescott-history-565.txt

            dulcinea     272 http://www.csug.rochester.edu/172/5_skiplists/texts/quixote

          dimmesdale     102 http://www.csug.rochester.edu/172/5_skiplists/texts/scarlet1.txt

            blakeney     156 http://www.csug.rochester.edu/172/5_skiplists/texts/scarp10.txt

           middlemas     206 http://www.csug.rochester.edu/172/5_skiplists/texts/scott-chronicles-158.txt

              cedric     305 http://www.csug.rochester.edu/172/5_skiplists/texts/scott-ivanhoe-159.txt

                NONE       0 http://www.csug.rochester.edu/172/5_skiplists/texts/sister_carrie                           0 http://www.csug.rochester.edu/172/5_skiplists/texts/sister_carrie

             songtxt       2 http://www.csug.rochester.edu/172/5_skiplists/texts/song10.txt

               dawes     173 http://www.csug.rochester.edu/172/5_skiplists/texts/sonsa10.txt

            earthbox       6 http://www.csug.rochester.edu/172/5_skiplists/texts/stoker-dracula-168.txt

     pgetextlimbrtxt       1 http://www.csug.rochester.edu/172/5_skiplists/texts/stratton-girl-405.txt

          houyhnhnms      50 http://www.csug.rochester.edu/172/5_skiplists/texts/swift-gullivers-728.txt

         durberville     155 http://www.csug.rochester.edu/172/5_skiplists/texts/tess10.txt

                NONE       0 http://www.csug.rochester.edu/172/5_skiplists/texts/the_mast                           0 http://www.csug.rochester.edu/172/5_skiplists/texts/the_mast

               ayala    1296 http://www.csug.rochester.edu/172/5_skiplists/texts/trollope-ayalas-192.txt

             mollusk       8 http://www.csug.rochester.edu/172/5_skiplists/texts/under_sea

                masr     259 http://www.csug.rochester.edu/172/5_skiplists/texts/utomc10.txt

               hirst     228 http://www.csug.rochester.edu/172/5_skiplists/texts/voout10.txt

            pickerel      11 http://www.csug.rochester.edu/172/5_skiplists/texts/waldn10.txt

              benhur     621 http://www.csug.rochester.edu/172/5_skiplists/texts/wallace-ben-564.txt

             natasha    1097 http://www.csug.rochester.edu/172/5_skiplists/texts/war_peace_text

          copernican      47 http://www.csug.rochester.edu/172/5_skiplists/texts/white-history-554.txt

            eidolons      22 http://www.csug.rochester.edu/172/5_skiplists/texts/whitman-leaves-195.txt

             emilius      10 http://www.csug.rochester.edu/172/5_skiplists/texts/wollstonecraft-vindication-197.txt

             carthew     204 http://www.csug.rochester.edu/172/5_skiplists/texts/wrecker.txt

            utterbol     216 http://www.csug.rochester.edu/172/5_skiplists/texts/wwend11.txt

Total Words: 14842585
Total number of Distinct Words: 151858
Total Runtime is: 21.734 seconds