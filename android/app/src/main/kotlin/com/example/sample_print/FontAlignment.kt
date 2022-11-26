package com.example.sample_print

import android.graphics.*
import com.google.zxing.BarcodeFormat
import com.google.zxing.EncodeHintType
import com.google.zxing.qrcode.QRCodeWriter
import com.pos.device.printer.PrintCanvas


class FontAlignment {
    fun alignCenterSize1(data: String): String? {
        var data = data
        val data_length = data.length
        data = if (data_length == 1 || data_length == 2) {
            "                  $data"
        } else if (data_length == 3 || data_length == 4) {
            "                 $data"
        } else if (data_length == 5 || data_length == 6) {
            "                $data"
        } else if (data_length == 7 || data_length == 8) {
            "               $data"
        } else if (data_length == 9 || data_length == 10) {
            "              $data"
        } else if (data_length == 11 || data_length == 12) {
            "             $data"
        } else if (data_length == 13 || data_length == 14) {
            "            $data"
        } else if (data_length == 15 || data_length == 16) {
            "           $data"
        } else if (data_length == 17 || data_length == 18) {
            "          $data"
        } else if (data_length == 19 || data_length == 20) {
            "         $data"
        } else if (data_length == 21 || data_length == 22) {
            "        $data"
        } else if (data_length == 23 || data_length == 24) {
            "       $data"
        } else if (data_length == 25 || data_length == 26) {
            "      $data"
        } else if (data_length == 27 || data_length == 28) {
            "     $data"
        } else if (data_length == 29 || data_length == 30) {
            "    $data"
        } else if (data_length == 31 || data_length == 32) {
            "   $data"
        } else if (data_length == 33 || data_length == 34) {
            "  $data"
        } else if (data_length == 35 || data_length == 36) {
            " $data"
        } else if (data_length == 37 || data_length == 38) {
            "" + data
        } else {
            data
        }
        return data
    }

    fun alignCenterSize2(data: String): String? {
        var data = data
        val data_length = data.length
        data = if (data_length == 1) {
            "              $data" //14
        } else if (data_length == 2 || data_length == 3) {
            "             $data" //13
        } else if (data_length == 4 || data_length == 5) {
            "            $data" //12
        } else if (data_length == 6 || data_length == 7) {
            "           $data" //11
        } else if (data_length == 8 || data_length == 9) {
            "          $data" //10
        } else if (data_length == 10 || data_length == 11) {
            "         $data" //9
        } else if (data_length == 12 || data_length == 13) {
            "        $data" //8
        } else if (data_length == 14 || data_length == 15) {
            "       $data" //7
        } else if (data_length == 16 || data_length == 17) {
            "      $data" //6
        } else if (data_length == 18 || data_length == 19) {
            "     $data" //5
        } else if (data_length == 20 || data_length == 21) {
            "    $data" //4
        } else if (data_length == 22 || data_length == 23) {
            "   $data" //3
        } else if (data_length == 24 || data_length == 25) {
            "  $data" //2
        } else if (data_length == 26 || data_length == 27) {
            " $data" //1
        } else {
            data
        }
        return data
    }

    fun alignCenterSize3(data: String): String? {
        var data = data
        val data_length = data.length
        data = if (data_length == 1 || data_length == 2) {
            "          $data" //10
        } else if (data_length == 3 || data_length == 4) {
            "         $data" //9
        } else if (data_length == 5 || data_length == 6) {
            "        $data"
        } else if (data_length == 7 || data_length == 8) {
            "       $data"
        } else if (data_length == 9 || data_length == 10) {
            "      $data"
        } else if (data_length == 11 || data_length == 12) {
            "     $data"
        } else if (data_length == 13 || data_length == 14) {
            "    $data"
        } else if (data_length == 15 || data_length == 16) {
            "   $data"
        } else if (data_length == 17 || data_length == 18) {
            "  $data"
        } else if (data_length == 19 || data_length == 20) {
            " $data"
        } else {
            data
        }
        return data
    }

    fun alignRightSize2T(data: String): String? {
        var data = data
        val data_length = data.length
        data = if (data.length == 1) {
            "                  $data" //18
        } else if (data.length == 2) {
            "                 $data" //17
        } else if (data.length == 3) {
            "                $data" //16
        } else if (data.length == 4) {
            "              $data" //15
        } else if (data.length == 5) {
            "             $data" //14
        } else if (data.length == 6) {
            "            $data" //13
        } else if (data.length == 7) {
            "           $data" //12
        } else if (data.length == 8) {
            "           $data" //11
        } else if (data.length == 9) {
            "          $data" //10
        } else if (data.length == 10) {
            "         $data" //9
        } else if (data.length == 11) {
            "        $data" //8
        } else if (data.length == 12) {
            "       $data" //7
        } else {
            "      $data"
        }
        return data
    }

    fun alignRightSize2(data: String): String? {
        var data = data
        val data_length = data.length
        data = if (data.length == 1) {
            "                  $data" //18
        } else if (data.length == 2) {
            "                 $data" //17
        } else if (data.length == 3) {
            "                $data" //16
        } else if (data.length == 4) {
            "              $data" //15
        } else if (data.length == 5) {
            "             $data" //14
        } else if (data.length == 6) {
            "             $data" //13
        } else if (data.length == 7) {
            "            $data" //12
        } else if (data.length == 8) {
            "           $data" //11
        } else if (data.length == 9) {
            "          $data" //10
        } else if (data.length == 10) {
            "         $data" //9
        } else if (data.length == 11) {
            "        $data" //8
        } else if (data.length == 12) {
            "       $data" //7
        } else {
            "      $data"
        }
        return data
    }

    fun alignRightSize222(data: String): String? {
        var data = data
        val data_length = data.length
        data = if (data.length == 1) {
            "                 $data" //18
        } else if (data.length == 2) {
            "                $data" //17
        } else if (data.length == 3) {
            "               $data" //16
        } else if (data.length == 4) {
            "             $data" //15
        } else if (data.length == 5) {
            "            $data" //14
        } else if (data.length == 6) {
            "            $data" //13
        } else if (data.length == 7) {
            "           $data" //12
        } else if (data.length == 8) {
            "          $data" //11
        } else if (data.length == 9) {
            "         $data" //10
        } else if (data.length == 10) {
            "        $data" //9
        } else if (data.length == 11) {
            "       $data" //8
        } else if (data.length == 12) {
            "      $data" //7
        } else {
            "     $data"
        }
        return data
    }

    fun alignRightSize22(data: String): String? {
        var data = data
        val data_length = data.length
        data = if (data.length == 1) {
            "                  $data" //18
        } else if (data.length == 2) {
            "                 $data" //17
        } else if (data.length == 3) {
            "                $data" //16
        } else if (data.length == 4) {
            "               $data" //15
        } else if (data.length == 5) {
            "              $data" //14
        } else if (data.length == 6) {
            "             $data" //13
        } else if (data.length == 7) {
            "            $data" //12
        } else if (data.length == 8) {
            "           $data" //11
        } else if (data.length == 9) {
            "          $data" //10
        } else if (data.length == 10) {
            "         $data" //9
        } else if (data.length == 11) {
            "        $data" //8
        } else if (data.length == 12) {
            "       $data" //7
        } else {
            "      $data"
        }
        return data
    }

    fun alignRightSizeemi(data: String): String? {
        var data = data
        val data_length = data.length
        data = if (data.length == 1) {
            "               $data" //18
        } else if (data.length == 2) {
            "              $data" //17
        } else if (data.length == 3) {
            "             $data" //16
        } else if (data.length == 4) {
            "            $data" //15
        } else if (data.length == 5) {
            "           $data" //14
        } else if (data.length == 6) {
            "          $data" //13
        } else if (data.length == 7) {
            "         $data" //12
        } else if (data.length == 8) {
            "        $data" //11
        } else if (data.length == 9) {
            "       $data" //10
        } else if (data.length == 10) {
            "      $data" //9
        } else if (data.length == 11) {
            "     $data" //8
        } else if (data.length == 12) {
            "    $data" //7
        } else {
            "   $data"
        }
        return data
    }

    fun alignRightSizedgereward(data: String): String? {
        var data = data
        val data_length = data.length
        data = if (data.length == 1) {
            "             $data" //18
        } else if (data.length == 2) {
            "            $data" //17
        } else if (data.length == 3) {
            "           $data" //16
        } else if (data.length == 4) {
            "          $data" //15
        } else if (data.length == 5) {
            "         $data" //14
        } else if (data.length == 6) {
            "        $data" //13
        } else if (data.length == 7) {
            "       $data" //12
        } else if (data.length == 8) {
            "      $data" //11
        } else if (data.length == 9) {
            "     $data" //10
        } else if (data.length == 10) {
            "    $data" //9
        } else if (data.length == 11) {
            "   $data" //8
        } else if (data.length == 12) {
            "  $data" //7
        } else {
            " $data"
        }
        return data
    }

    fun leftRightAlignment(leftValue: String, rightValue: String): String? {
        var data: String? = null
        val left_length = leftValue.length
        val right_length = rightValue.length
        when (left_length) {
            4 -> if (right_length == 1) {
                data = "$leftValue                                 $rightValue" //33

            } else if (right_length == 2) {
                data = "$leftValue                                $rightValue" //32

            } else if (right_length == 3) {
                data = "$leftValue                               $rightValue" //31

            } else if (right_length == 4) {
                data = "$leftValue                              $rightValue" //30

            } else if (right_length == 5) {
                data = "$leftValue                             $rightValue" //29

            } else if (right_length == 6) {
                data = "$leftValue                            $rightValue" //28

            } else if (right_length == 7) {
                data = "$leftValue                           $rightValue" //27

            } else if (right_length == 8) {
                data = "$leftValue                          $rightValue" //26

            } else if (right_length == 9) {
                data = "$leftValue                         $rightValue" //25

            } else if (right_length == 10) {
                data = "$leftValue                        $rightValue" //24

            } else if (right_length == 11) {
                data = "$leftValue                       $rightValue" //23

            } else if (right_length == 12) {
                data = "$leftValue                      $rightValue" //22

            } else if (right_length == 13) {
                data = "$leftValue                     $rightValue" //21

            } else if (right_length == 14) {
                data = "$leftValue                    $rightValue" //20

            } else if (right_length == 15) {
                data = "$leftValue                   $rightValue" //19

            } else if (right_length == 16) {
                data = "$leftValue                  $rightValue" //18

            } else if (right_length == 17) {
                data = "$leftValue                 $rightValue" //17

            } else if (right_length == 18) {
                data = "$leftValue                $rightValue" //16

            } else if (right_length == 19) {
                data = "$leftValue               $rightValue" //15

            } else if (right_length == 20) {
                data = "$leftValue              $rightValue" //14

            } else {
                data = "$leftValue     $rightValue"

            }
            5 -> if (right_length == 1) {
                data = "$leftValue                                $rightValue" //32

            } else if (right_length == 2) {
                data = "$leftValue                               $rightValue" //31

            } else if (right_length == 3) {
                data = "$leftValue                              $rightValue" //30

            } else if (right_length == 4) {
                data = "$leftValue                             $rightValue" //29

            } else if (right_length == 5) {
                data = "$leftValue                            $rightValue" //28

            } else if (right_length == 6) {
                data = "$leftValue                           $rightValue" //27

            } else if (right_length == 7) {
                data = "$leftValue                          $rightValue" //26

            } else if (right_length == 8) {
                data = "$leftValue                         $rightValue" //25

            } else if (right_length == 9) {
                data = "$leftValue                        $rightValue" //24

            } else if (right_length == 10) {
                data = "$leftValue                       $rightValue" //23

            } else if (right_length == 11) {
                data = "$leftValue                      $rightValue" //22

            } else if (right_length == 12) {
                data = "$leftValue                     $rightValue" //21

            } else if (right_length == 13) {
                data = "$leftValue                    $rightValue" //20

            } else if (right_length == 14) {
                data = "$leftValue                   $rightValue" //19

            } else if (right_length == 15) {
                data = "$leftValue                  $rightValue" //18

            } else if (right_length == 16) {
                data = "$leftValue                 $rightValue" //17

            } else if (right_length == 17) {
                data = "$leftValue                $rightValue" //16

            } else if (right_length == 18) {
                data = "$leftValue               $rightValue" //15

            } else if (right_length == 19) {
                data = "$leftValue              $rightValue" //14

            } else if (right_length == 20) {
                data = "$leftValue             $rightValue" //13

            } else {
                data = "$leftValue     $rightValue"

            }
            6 -> if (right_length == 1) {
                data = "$leftValue                               $rightValue" //31

            } else if (right_length == 2) {
                data = "$leftValue                              $rightValue" //30

            } else if (right_length == 3) {
                data = "$leftValue                             $rightValue" //29

            } else if (right_length == 4) {
                data = "$leftValue                            $rightValue" //28

            } else if (right_length == 5) {
                data = "$leftValue                           $rightValue" //27

            } else if (right_length == 6) {
                data = "$leftValue                          $rightValue" //26

            } else if (right_length == 7) {
                data = "$leftValue                         $rightValue" //25

            } else if (right_length == 8) {
                data = "$leftValue                        $rightValue" //24

            } else if (right_length == 9) {
                data = "$leftValue                       $rightValue" //23

            } else if (right_length == 10) {
                data = "$leftValue                      $rightValue" //22

            } else if (right_length == 11) {
                data = "$leftValue                     $rightValue" //21

            } else if (right_length == 12) {
                data = "$leftValue                    $rightValue" //20

            } else if (right_length == 13) {
                data = "$leftValue                   $rightValue" //19

            } else if (right_length == 14) {
                data = "$leftValue                  $rightValue" //18

            } else if (right_length == 15) {
                data = "$leftValue                 $rightValue" //17

            } else if (right_length == 16) {
                data = "$leftValue                $rightValue" //16

            } else if (right_length == 17) {
                data = "$leftValue               $rightValue" //15

            } else if (right_length == 18) {
                data = "$leftValue              $rightValue" //14

            } else if (right_length == 19) {
                data = "$leftValue             $rightValue" //13

            } else if (right_length == 20) {
                data = "$leftValue            $rightValue" //12

            } else {
                data = "$leftValue     $rightValue"

            }
            7 -> if (right_length == 1) {
                data = "$leftValue                              $rightValue" //30

            } else if (right_length == 2) {
                data = "$leftValue                             $rightValue" //29

            } else if (right_length == 3) {
                data = "$leftValue                            $rightValue" //28

            } else if (right_length == 4) {
                data = "$leftValue                           $rightValue" //27

            } else if (right_length == 5) {
                data = "$leftValue                          $rightValue" //26

            } else if (right_length == 6) {
                data = "$leftValue                         $rightValue" //25

            } else if (right_length == 7) {
                data = "$leftValue                        $rightValue" //24

            } else if (right_length == 8) {
                data = "$leftValue                       $rightValue" //23

            } else if (right_length == 9) {
                data = "$leftValue                      $rightValue" //22

            } else if (right_length == 10) {
                data = "$leftValue                     $rightValue" //21

            } else if (right_length == 11) {
                data = "$leftValue                    $rightValue" //20

            } else if (right_length == 12) {
                data = "$leftValue                   $rightValue" //19

            } else if (right_length == 13) {
                data = "$leftValue                  $rightValue" //18

            } else if (right_length == 14) {
                data = "$leftValue                 $rightValue" //17

            } else if (right_length == 15) {
                data = "$leftValue                $rightValue" //16

            } else if (right_length == 16) {
                data = "$leftValue               $rightValue" //15

            } else if (right_length == 17) {
                data = "$leftValue              $rightValue" //14

            } else if (right_length == 18) {
                data = "$leftValue             $rightValue" //13

            } else if (right_length == 19) {
                data = "$leftValue            $rightValue" //12

            } else if (right_length == 20) {
                data = "$leftValue           $rightValue" //11

            } else {
                data = "$leftValue     $rightValue"

            }
            8 -> if (right_length == 1) {
                data = "$leftValue                             $rightValue" //29

            } else if (right_length == 2) {
                data = "$leftValue                            $rightValue" //28

            } else if (right_length == 3) {
                data = "$leftValue                           $rightValue" //27

            } else if (right_length == 4) {
                data = "$leftValue                          $rightValue" //26

            } else if (right_length == 5) {
                data = "$leftValue                         $rightValue" //25

            } else if (right_length == 6) {
                data = "$leftValue                        $rightValue" //24

            } else if (right_length == 7) {
                data = "$leftValue                       $rightValue" //23

            } else if (right_length == 8) {
                data = "$leftValue                      $rightValue" //22

            } else if (right_length == 9) {
                data = "$leftValue                     $rightValue" //21

            } else if (right_length == 10) {
                data = "$leftValue                    $rightValue" //20

            } else if (right_length == 11) {
                data = "$leftValue                   $rightValue" //19

            } else if (right_length == 12) {
                data = "$leftValue                  $rightValue" //18

            } else if (right_length == 13) {
                data = "$leftValue                 $rightValue" //17

            } else if (right_length == 14) {
                data = "$leftValue                $rightValue" //16

            } else if (right_length == 15) {
                data = "$leftValue               $rightValue" //15

            } else if (right_length == 16) {
                data = "$leftValue              $rightValue" //14

            } else if (right_length == 17) {
                data = "$leftValue             $rightValue" //13

            } else if (right_length == 18) {
                data = "$leftValue            $rightValue" //12

            } else if (right_length == 19) {
                data = "$leftValue           $rightValue" //11

            } else if (right_length == 20) {
                data = "$leftValue          $rightValue" //10

            } else {
                data = "$leftValue     $rightValue"

            }
            9 -> if (right_length == 1) {
                data = "$leftValue                            $rightValue" //28

            } else if (right_length == 2) {
                data = "$leftValue                           $rightValue" //27

            } else if (right_length == 3) {
                data = "$leftValue                          $rightValue" //26

            } else if (right_length == 4) {
                data = "$leftValue                         $rightValue" //25

            } else if (right_length == 5) {
                data = "$leftValue                        $rightValue" //24

            } else if (right_length == 6) {
                data = "$leftValue                       $rightValue" //23

            } else if (right_length == 7) {
                data = "$leftValue                      $rightValue" //22

            } else if (right_length == 8) {
                data = "$leftValue                     $rightValue" //21

            } else if (right_length == 9) {
                data = "$leftValue                    $rightValue" //20

            } else if (right_length == 10) {
                data = "$leftValue                   $rightValue" //19

            } else if (right_length == 11) {
                data = "$leftValue                  $rightValue" //18

            } else if (right_length == 12) {
                data = "$leftValue                 $rightValue" //17

            } else if (right_length == 13) {
                data = "$leftValue                $rightValue" //16

            } else if (right_length == 14) {
                data = "$leftValue               $rightValue" //15

            } else if (right_length == 15) {
                data = "$leftValue              $rightValue" //14

            } else if (right_length == 16) {
                data = "$leftValue             $rightValue" //13

            } else if (right_length == 17) {
                data = "$leftValue            $rightValue" //12

            } else if (right_length == 18) {
                data = "$leftValue           $rightValue" //11

            } else if (right_length == 19) {
                data = "$leftValue          $rightValue" //10

            } else if (right_length == 20) {
                data = "$leftValue         $rightValue" //9

            } else {
                data = "$leftValue        $rightValue"

            }
            10 -> if (right_length == 1) {
                data = "$leftValue                           $rightValue" //27

            } else if (right_length == 2) {
                data = "$leftValue                          $rightValue" //26

            } else if (right_length == 3) {
                data = "$leftValue                         $rightValue" //25

            } else if (right_length == 4) {
                data = "$leftValue                        $rightValue" //24

            } else if (right_length == 5) {
                data = "$leftValue                       $rightValue" //23

            } else if (right_length == 6) {
                data = "$leftValue                      $rightValue" //22

            } else if (right_length == 7) {
                data = "$leftValue                     $rightValue" //21

            } else if (right_length == 8) {
                data = "$leftValue                    $rightValue" //20

            } else if (right_length == 9) {
                data = "$leftValue                   $rightValue" //19

            } else if (right_length == 10) {
                data = "$leftValue                  $rightValue" //18

            } else if (right_length == 11) {
                data = "$leftValue                 $rightValue" //17

            } else if (right_length == 12) {
                data = "$leftValue                $rightValue" //16

            } else if (right_length == 13) {
                data = "$leftValue               $rightValue" //15

            } else if (right_length == 14) {
                data = "$leftValue              $rightValue" //14

            } else if (right_length == 15) {
                data = "$leftValue             $rightValue" //13

            } else if (right_length == 16) {
                data = "$leftValue            $rightValue" //12

            } else if (right_length == 17) {
                data = "$leftValue           $rightValue" //11

            } else if (right_length == 18) {
                data = "$leftValue          $rightValue" //10

            } else if (right_length == 19) {
                data = "$leftValue         $rightValue" //9

            } else if (right_length == 20) {
                data = "$leftValue        $rightValue" //8

            } else {
                data = "$leftValue       $rightValue"

            }
            11 -> if (right_length == 1) {
                data = "$leftValue                          $rightValue" //26

            } else if (right_length == 2) {
                data = "$leftValue                         $rightValue" //25

            } else if (right_length == 3) {
                data = "$leftValue                        $rightValue" //24

            } else if (right_length == 4) {
                data = "$leftValue                       $rightValue" //23

            } else if (right_length == 5) {
                data = "$leftValue                      $rightValue" //22

            } else if (right_length == 6) {
                data = "$leftValue                     $rightValue" //21

            } else if (right_length == 7) {
                data = "$leftValue                    $rightValue" //20

            } else if (right_length == 8) {
                data = "$leftValue                   $rightValue" //19

            } else if (right_length == 9) {
                data = "$leftValue                  $rightValue" //18

            } else if (right_length == 10) {
                data = "$leftValue                 $rightValue" //17

            } else if (right_length == 11) {
                data = "$leftValue                $rightValue" //16

            } else if (right_length == 12) {
                data = "$leftValue               $rightValue" //15

            } else if (right_length == 13) {
                data = "$leftValue              $rightValue" //14

            } else if (right_length == 14) {
                data = "$leftValue             $rightValue" //13

            } else if (right_length == 15) {
                data = "$leftValue            $rightValue" //12

            } else if (right_length == 16) {
                data = "$leftValue           $rightValue" //11

            } else if (right_length == 17) {
                data = "$leftValue          $rightValue" //10

            } else if (right_length == 18) {
                data = "$leftValue         $rightValue" //9

            } else if (right_length == 19) {
                data = "$leftValue        $rightValue" //8

            } else if (right_length == 20) {
                data = "$leftValue       $rightValue" //7

            } else {
                data = "$leftValue      $rightValue"

            }
            12 -> if (right_length == 1) {
                data = "$leftValue                         $rightValue" //25

            } else if (right_length == 2) {
                data = "$leftValue                        $rightValue" //24

            } else if (right_length == 3) {
                data = "$leftValue                       $rightValue" //23

            } else if (right_length == 4) {
                data = "$leftValue                      $rightValue" //22

            } else if (right_length == 5) {
                data = "$leftValue                     $rightValue" //21

            } else if (right_length == 6) {
                data = "$leftValue                    $rightValue" //20

            } else if (right_length == 7) {
                data = "$leftValue                   $rightValue" //19

            } else if (right_length == 8) {
                data = "$leftValue                  $rightValue" //18

            } else if (right_length == 9) {
                data = "$leftValue                 $rightValue" //17

            } else if (right_length == 10) {
                data = "$leftValue                $rightValue" //16

            } else if (right_length == 11) {
                data = "$leftValue               $rightValue" //15

            } else if (right_length == 12) {
                data = "$leftValue              $rightValue" //14

            } else if (right_length == 13) {
                data = "$leftValue             $rightValue" //13

            } else if (right_length == 14) {
                data = "$leftValue            $rightValue" //12

            } else if (right_length == 15) {
                data = "$leftValue           $rightValue" //11

            } else if (right_length == 16) {
                data = "$leftValue          $rightValue" //10

            } else if (right_length == 17) {
                data = "$leftValue         $rightValue" //9

            } else if (right_length == 18) {
                data = "$leftValue        $rightValue" //8

            } else if (right_length == 19) {
                data = "$leftValue       $rightValue" //7

            } else if (right_length == 20) {
                data = "$leftValue      $rightValue" //6

            } else {
                data = "$leftValue     $rightValue"

            }
            13 -> if (right_length == 1) {
                data = "$leftValue                        $rightValue" //24

            } else if (right_length == 2) {
                data = "$leftValue                       $rightValue" //23

            } else if (right_length == 3) {
                data = "$leftValue                      $rightValue" //22

            } else if (right_length == 4) {
                data = "$leftValue                     $rightValue" //21

            } else if (right_length == 5) {
                data = "$leftValue                    $rightValue" //20

            } else if (right_length == 6) {
                data = "$leftValue                   $rightValue" //19

            } else if (right_length == 7) {
                data = "$leftValue                  $rightValue" //18

            } else if (right_length == 8) {
                data = "$leftValue                 $rightValue" //17

            } else if (right_length == 9) {
                data = "$leftValue                $rightValue" //16

            } else if (right_length == 10) {
                data = "$leftValue               $rightValue" //15

            } else if (right_length == 11) {
                data = "$leftValue              $rightValue" //14

            } else if (right_length == 12) {
                data = "$leftValue             $rightValue" //13

            } else if (right_length == 13) {
                data = "$leftValue            $rightValue" //12

            } else if (right_length == 14) {
                data = "$leftValue           $rightValue" //11

            } else if (right_length == 15) {
                data = "$leftValue          $rightValue" //10

            } else if (right_length == 16) {
                data = "$leftValue         $rightValue" //9

            } else if (right_length == 17) {
                data = "$leftValue        $rightValue" //8

            } else if (right_length == 18) {
                data = "$leftValue       $rightValue" //7

            } else if (right_length == 19) {
                data = "$leftValue      $rightValue" //6

            } else if (right_length == 20) {
                data = "$leftValue     $rightValue" //5

            } else {
                data = "$leftValue    $rightValue"

            }
            14 -> if (right_length == 1) {
                data = "$leftValue                       $rightValue" //23

            } else if (right_length == 2) {
                data = "$leftValue                      $rightValue" //22

            } else if (right_length == 3) {
                data = "$leftValue                     $rightValue" //21

            } else if (right_length == 4) {
                data = "$leftValue                    $rightValue" //20

            } else if (right_length == 5) {
                data = "$leftValue                   $rightValue" //19

            } else if (right_length == 6) {
                data = "$leftValue                  $rightValue" //18

            } else if (right_length == 7) {
                data = "$leftValue                 $rightValue" //17

            } else if (right_length == 8) {
                data = "$leftValue                $rightValue" //16

            } else if (right_length == 9) {
                data = "$leftValue               $rightValue" //15

            } else if (right_length == 10) {
                data = "$leftValue              $rightValue" //14

            } else if (right_length == 11) {
                data = "$leftValue             $rightValue" //13

            } else if (right_length == 12) {
                data = "$leftValue            $rightValue" //12

            } else if (right_length == 13) {
                data = "$leftValue           $rightValue" //11

            } else if (right_length == 14) {
                data = "$leftValue          $rightValue" //10

            } else if (right_length == 15) {
                data = "$leftValue         $rightValue" //9

            } else if (right_length == 16) {
                data = "$leftValue        $rightValue" //8

            } else if (right_length == 17) {
                data = "$leftValue       $rightValue" //7

            } else if (right_length == 18) {
                data = "$leftValue      $rightValue" //6

            } else if (right_length == 19) {
                data = "$leftValue     $rightValue" //5

            } else if (right_length == 20) {
                data = "$leftValue    $rightValue" //4

            } else {
                data = "$leftValue   $rightValue"

            }
            15 -> if (right_length == 1) {
                data = "$leftValue                      $rightValue" //22

            } else if (right_length == 2) {
                data = "$leftValue                     $rightValue" //21

            } else if (right_length == 3) {
                data = "$leftValue                    $rightValue" //20

            } else if (right_length == 4) {
                data = "$leftValue                   $rightValue" //19

            } else if (right_length == 5) {
                data = "$leftValue                  $rightValue" //18

            } else if (right_length == 6) {
                data = "$leftValue                 $rightValue" //17

            } else if (right_length == 7) {
                data = "$leftValue                $rightValue" //16

            } else if (right_length == 8) {
                data = "$leftValue               $rightValue" //15

            } else if (right_length == 9) {
                data = "$leftValue              $rightValue" //14

            } else if (right_length == 10) {
                data = "$leftValue             $rightValue" //13

            } else if (right_length == 11) {
                data = "$leftValue            $rightValue" //12

            } else if (right_length == 12) {
                data = "$leftValue           $rightValue" //11

            } else if (right_length == 13) {
                data = "$leftValue          $rightValue" //10

            } else if (right_length == 14) {
                data = "$leftValue         $rightValue" //9

            } else if (right_length == 15) {
                data = "$leftValue        $rightValue" //8

            } else if (right_length == 16) {
                data = "$leftValue       $rightValue" //7

            } else if (right_length == 17) {
                data = "$leftValue      $rightValue" //6

            } else if (right_length == 18) {
                data = "$leftValue     $rightValue" //5

            } else if (right_length == 19) {
                data = "$leftValue    $rightValue" //4

            } else if (right_length == 20) {
                data = "$leftValue   $rightValue" //3

            } else {
                data = "$leftValue  $rightValue"

            }
            16 -> if (right_length == 1) {
                data = "$leftValue                     $rightValue" //21

            } else if (right_length == 2) {
                data = "$leftValue                    $rightValue" //20

            } else if (right_length == 3) {
                data = "$leftValue                   $rightValue" //19

            } else if (right_length == 4) {
                data = "$leftValue                  $rightValue" //18

            } else if (right_length == 5) {
                data = "$leftValue                 $rightValue" //17

            } else if (right_length == 6) {
                data = "$leftValue                $rightValue" //16

            } else if (right_length == 7) {
                data = "$leftValue               $rightValue" //15

            } else if (right_length == 8) {
                data = "$leftValue              $rightValue" //14

            } else if (right_length == 9) {
                data = "$leftValue             $rightValue" //13

            } else if (right_length == 10) {
                data = "$leftValue            $rightValue" //12

            } else if (right_length == 11) {
                data = "$leftValue           $rightValue" //11

            } else if (right_length == 12) {
                data = "$leftValue          $rightValue" //10

            } else if (right_length == 13) {
                data = "$leftValue         $rightValue" //9

            } else if (right_length == 14) {
                data = "$leftValue        $rightValue" //8

            } else if (right_length == 15) {
                data = "$leftValue       $rightValue" //7

            } else if (right_length == 16) {
                data = "$leftValue      $rightValue" //6

            } else if (right_length == 17) {
                data = "$leftValue     $rightValue" //5

            } else if (right_length == 18) {
                data = "$leftValue    $rightValue" //4

            } else if (right_length == 19) {
                data = "$leftValue   $rightValue" //3

            } else if (right_length == 20) {
                data = "$leftValue  $rightValue" //2

            } else {
                data = "$leftValue  $rightValue"

            }
            17 -> if (right_length == 1) {
                data = "$leftValue                    $rightValue" //20

            } else if (right_length == 2) {
                data = "$leftValue                   $rightValue" //19

            } else if (right_length == 3) {
                data = "$leftValue                  $rightValue" //18

            } else if (right_length == 4) {
                data = "$leftValue                 $rightValue" //17

            } else if (right_length == 5) {
                data = "$leftValue                $rightValue" //16

            } else if (right_length == 6) {
                data = "$leftValue               $rightValue" //15

            } else if (right_length == 7) {
                data = "$leftValue              $rightValue" //14

            } else if (right_length == 8) {
                data = "$leftValue             $rightValue" //13

            } else if (right_length == 9) {
                data = "$leftValue            $rightValue" //12

            } else if (right_length == 10) {
                data = "$leftValue           $rightValue" //11

            } else if (right_length == 11) {
                data = "$leftValue          $rightValue" //10

            } else if (right_length == 12) {
                data = "$leftValue         $rightValue" //9

            } else if (right_length == 13) {
                data = "$leftValue        $rightValue" //8

            } else if (right_length == 14) {
                data = "$leftValue       $rightValue" //7

            } else if (right_length == 15) {
                data = "$leftValue      $rightValue" //6

            } else if (right_length == 16) {
                data = "$leftValue     $rightValue" //5

            } else if (right_length == 17) {
                data = "$leftValue    $rightValue" //4

            } else if (right_length == 18) {
                data = "$leftValue   $rightValue" //3

            } else if (right_length == 19) {
                data = "$leftValue  $rightValue" //2

            } else if (right_length == 20) {
                data = "$leftValue $rightValue" //1

            } else {
                data = leftValue + "" + rightValue

            }
            18 -> if (right_length == 1) {
                data = "$leftValue                   $rightValue" //19

            } else if (right_length == 2) {
                data = "$leftValue                  $rightValue" //18

            } else if (right_length == 3) {
                data = "$leftValue                 $rightValue" //17

            } else if (right_length == 4) {
                data = "$leftValue                $rightValue" //16

            } else if (right_length == 5) {
                data = "$leftValue               $rightValue" //15

            } else if (right_length == 6) {
                data = "$leftValue              $rightValue" //14

            } else if (right_length == 7) {
                data = "$leftValue             $rightValue" //13

            } else if (right_length == 8) {
                data = "$leftValue            $rightValue" //12

            } else if (right_length == 9) {
                data = "$leftValue           $rightValue" //11

            } else if (right_length == 10) {
                data = "$leftValue          $rightValue" //10

            } else if (right_length == 11) {
                data = "$leftValue         $rightValue" //9

            } else if (right_length == 12) {
                data = "$leftValue        $rightValue" //8

            } else if (right_length == 13) {
                data = "$leftValue       $rightValue" //7

            } else if (right_length == 14) {
                data = "$leftValue      $rightValue" //6

            } else if (right_length == 15) {
                data = "$leftValue     $rightValue" //5

            } else if (right_length == 16) {
                data = "$leftValue    $rightValue" //4

            } else if (right_length == 17) {
                data = "$leftValue   $rightValue" //3

            } else if (right_length == 18) {
                data = "$leftValue  $rightValue" //2

            } else if (right_length == 19) {
                data = "$leftValue $rightValue" //1

            } else {
                data = leftValue + "" + rightValue

            }
            19 -> if (right_length == 1) {
                data = "$leftValue                  $rightValue" //18

            } else if (right_length == 2) {
                data = "$leftValue                 $rightValue" //17

            } else if (right_length == 3) {
                data = "$leftValue                $rightValue" //16

            } else if (right_length == 4) {
                data = "$leftValue               $rightValue" //15

            } else if (right_length == 5) {
                data = "$leftValue              $rightValue" //14

            } else if (right_length == 6) {
                data = "$leftValue             $rightValue" //13

            } else if (right_length == 7) {
                data = "$leftValue            $rightValue" //12

            } else if (right_length == 8) {
                data = "$leftValue           $rightValue" //11

            } else if (right_length == 9) {
                data = "$leftValue          $rightValue" //10

            } else if (right_length == 10) {
                data = "$leftValue         $rightValue" //9

            } else if (right_length == 11) {
                data = "$leftValue        $rightValue" //8

            } else if (right_length == 12) {
                data = "$leftValue       $rightValue" //7

            } else if (right_length == 13) {
                data = "$leftValue      $rightValue" //6

            } else if (right_length == 14) {
                data = "$leftValue     $rightValue" //5

            } else if (right_length == 15) {
                data = "$leftValue    $rightValue" //4

            } else if (right_length == 16) {
                data = "$leftValue   $rightValue" //3

            } else if (right_length == 17) {
                data = "$leftValue  $rightValue" //2

            } else if (right_length == 18) {
                data = "$leftValue $rightValue" //1

            } else {
                data = leftValue + "" + rightValue

            }
            20 -> if (right_length == 1) {
                data = "$leftValue                 $rightValue" //17

            } else if (right_length == 2) {
                data = "$leftValue                $rightValue" //16

            } else if (right_length == 3) {
                data = "$leftValue               $rightValue" //15

            } else if (right_length == 4) {
                data = "$leftValue              $rightValue" //14

            } else if (right_length == 5) {
                data = "$leftValue             $rightValue" //13

            } else if (right_length == 6) {
                data = "$leftValue            $rightValue" //12

            } else if (right_length == 7) {
                data = "$leftValue           $rightValue" //11

            } else if (right_length == 8) {
                data = "$leftValue          $rightValue" //10

            } else if (right_length == 9) {
                data = "$leftValue         $rightValue" //9

            } else if (right_length == 10) {
                data = "$leftValue        $rightValue" //8

            } else if (right_length == 11) {
                data = "$leftValue       $rightValue" //7

            } else if (right_length == 12) {
                data = "$leftValue      $rightValue" //6

            } else if (right_length == 13) {
                data = "$leftValue     $rightValue" //5

            } else if (right_length == 14) {
                data = "$leftValue    $rightValue" //4

            } else if (right_length == 15) {
                data = "$leftValue   $rightValue" //3

            } else if (right_length == 16) {
                data = "$leftValue  $rightValue" //2

            } else if (right_length == 17) {
                data = "$leftValue $rightValue" //1

            } else {
                data = leftValue + "" + rightValue

            }
            else -> data = "$leftValue     $rightValue"
        }
        return data
    }

    fun alignRightSize6(data: String): String? {
        var data = data
        val data_length = data.length
        data = if (data_length == 1) {
            "            $data" //13
        } else if (data_length == 2) {
            "           $data" //12
        } else if (data_length == 3) {
            "          $data" //11
        } else if (data_length == 4) {
            "         $data" //10
        } else if (data_length == 5) {
            "        $data" //9
        } else if (data_length == 6) {
            "       $data" //8
        } else if (data_length == 7) {
            "      $data" //7
        } else if (data_length == 8) {
            "     $data" //6
        } else if (data_length == 9) {
            "    $data" //5
        } else if (data_length == 10) {
            "   $data" //4
        } else if (data_length == 11) {
            "  $data" //3
        } else if (data_length == 12) {
            " $data" //2
        } else {
            "" + data
        }
        return data
    }
    fun alignRightSize7(data: String): String? {
        var data = data
        val data_length = data.length
        data = if (data_length == 1) {
            "          $data" //13
        } else if (data_length == 2) {
            "         $data" //12
        } else if (data_length == 3) {
            "        $data" //11
        } else if (data_length == 4) {
            "       $data" //10
        } else if (data_length == 5) {
            "      $data" //9
        } else if (data_length == 6) {
            "     $data" //8
        } else if (data_length == 7) {
            "    $data" //7
        } else if (data_length == 8) {
            "   $data" //6
        } else if (data_length == 9) {
            "  $data" //5
        } else if (data_length == 10) {
            " $data" //4
        } else if (data_length == 11) {
            " $data" //3
        } else if (data_length == 12) {
            " $data" //2
        } else {
            "" + data
        }
        return data
    }
    fun alignRightSize5(data: String): String? {
        var data = data
        val data_length = data.length
        data = if (data_length == 1) {
            "             $data" //13
        } else if (data_length == 2) {
            "            $data" //12
        } else if (data_length == 3) {
            "           $data" //11
        } else if (data_length == 4) {
            "          $data" //10
        } else if (data_length == 5) {
            "         $data" //9
        } else if (data_length == 6) {
            "        $data" //8
        } else if (data_length == 7) {
            "       $data" //7
        } else if (data_length == 8) {
            "      $data" //6
        } else if (data_length == 9) {
            "     $data" //5
        } else if (data_length == 10) {
            "    $data" //4
        } else if (data_length == 11) {
            "   $data" //3
        } else if (data_length == 12) {
            "  $data" //2
        } else {
            " $data"
        }
        return data
    }
    fun leftRightAlignmentSize2(leftValue: String, rightValue: String): String? {
        var data: String? = null
        val left_length = leftValue.length
        val right_length = rightValue.length
        when (left_length) {
            10 -> if (right_length == 1) {
                data = "$leftValue                  $rightValue" //28

            } else if (right_length == 2) {
                data = "$leftValue                 $rightValue" //27

            } else if (right_length == 3) {
                data = "$leftValue                $rightValue" //26

            } else if (right_length == 4) {
                data = "$leftValue               $rightValue" //25

            } else if (right_length == 5) {
                data = "$leftValue              $rightValue" //24

            } else if (right_length == 6) {
                data = "$leftValue             $rightValue" //23

            } else if (right_length == 7) {
                data = "$leftValue            $rightValue" //22

            } else if (right_length == 8) {
                data = "$leftValue           $rightValue" //21

            } else if (right_length == 9) {
                data = "$leftValue          $rightValue" //20

            } else if (right_length == 10) {
                data = "$leftValue         $rightValue" //19

            } else if (right_length == 11) {
                data = "$leftValue        $rightValue" //18

            } else if (right_length == 12) {
                data = "$leftValue       $rightValue" //17

            } else if (right_length == 13) {
                data = "$leftValue      $rightValue" //16

            } else if (right_length == 14) {
                data = "$leftValue     $rightValue" //15

            } else if (right_length == 15) {
                data = "$leftValue    $rightValue" //14

            } else if (right_length == 16) {
                data = "$leftValue   $rightValue" //13

            } else if (right_length == 17) {
                data = "$leftValue  $rightValue" //12

            } else {
                data = "$leftValue $rightValue" //11

            }
            else -> {}
        }
        return data
    }

    fun setFontStyle(paint: Paint, size: Int, isBold: Boolean) {
        if (isBold) {
            val MONOSPACE_BOLD = Typeface.create(Typeface.MONOSPACE, Typeface.BOLD)
            paint.typeface = MONOSPACE_BOLD
        } else {
            paint.typeface = Typeface.MONOSPACE
        }
        when (size) {
            1 -> paint.textSize = 16f
            2 -> paint.textSize = 18f
            3 -> paint.textSize = 22f
            4 -> paint.textSize = 24f
            5 -> paint.textSize = 26f
            6 -> paint.textSize = 28f
            7 -> paint.textSize = 30f
            else -> {}
        }
    }

    fun printLine(paint: Paint,canvas: PrintCanvas){
        val line:String = "--------------------------------------"
        setFontStyle(paint,1,true)
        canvas.drawText(line,paint)

    }

    fun getQrCodeBitmap(receiptNo: String): Bitmap {
        val size = 256 //pixels
        val hints = hashMapOf<EncodeHintType, Int>().also { it[EncodeHintType.MARGIN] = 1 } // Make the QR code buffer border narrower
        val bits = QRCodeWriter().encode(receiptNo, BarcodeFormat.QR_CODE, size, size)
        return Bitmap.createBitmap(size, size, Bitmap.Config.RGB_565).also {
            for (x in 0 until size) {
                for (y in 0 until size) {
                    it.setPixel(x, y, if (bits[x, y]) Color.BLACK else Color.WHITE)
                }
            }
        }
    }

    fun getResizedBitmap(image:Bitmap, maxSize: Int): Bitmap? {
      var width:Int = image.width
        var height:Int = image.height
        val bitmapRatio:Float = ( width / height).toFloat()

        if (bitmapRatio > 1){
            width = maxSize
            height =  (width / bitmapRatio).toInt()
        }else{
            height = maxSize
            height =  (height * bitmapRatio).toInt()
        }
        return Bitmap.createScaledBitmap(image,width-60, height,true)
    }


    fun pad(Src: Bitmap,top: Float = 0F, bottom: Float = 0F, left: Float = 0F, right: Float = 0F): Bitmap {
        val output = Bitmap.createBitmap(
            (Src.width + left + right).toInt(),
            (Src.height + top + bottom).toInt(),
            Bitmap.Config.ARGB_8888
        )
        val canvas = Canvas(output)
        canvas.drawBitmap(Src, left, top, null)

        return output
    }





}